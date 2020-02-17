package com.neeraja.harrypotter.remote.source

import com.neeraja.harrypotter.data.models.CharacterData
import com.neeraja.harrypotter.data.models.HouseData
import com.neeraja.harrypotter.data.repository.RemoteDataSource
import com.neeraja.harrypotter.remote.api.HarryPotterService
import com.neeraja.harrypotter.remote.mapper.Mapper
import com.neeraja.harrypotter.remote.models.CharacterNetwork
import com.neeraja.harrypotter.remote.models.HouseNetwork
import com.neeraja.harrypotter.remote.models.ResponseWrapper
import io.reactivex.Observable
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
        private val houseMapper: Mapper<HouseData, HouseNetwork>,
        private val characterMapper: Mapper<CharacterData, CharacterNetwork>,
        private val potterService: HarryPotterService
) : RemoteDataSource {
    override fun getAllHouses(apiKey: String): Observable<List<HouseData>> {
        val observable: Observable<ResponseWrapper> = potterService.getAllHousesInfo(apiKey)
        return observable
                .map { response ->
                    println("Remote Get All Houses Invoked")
                    response.housesInfo.map {
                        houseMapper.from(it)
                    }
                }
    }

    override fun getCharacterById(apiKey: String, characterId: String): Observable<CharacterData> {
        return potterService.getCharacterById(apiKey, characterId)
                .map { response ->
                    println("Remote Get character By Id invoked")
                    characterMapper.from(response.character)
                }
    }

    override fun getHouseById(apiKey: String, houseId: String): Observable<HouseData> {
        return potterService.getHouseByIdInfo(apiKey, houseId)
                .map { response ->
                    println("Remote Get character By Id invoked")
                    houseMapper.from(response.houseInfo)
                }
    }

}