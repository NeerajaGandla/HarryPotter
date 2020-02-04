package com.neeraja.harrypotter.remote.source

import com.neeraja.harrypotter.data.models.CharacterData
import com.neeraja.harrypotter.data.models.HouseData
import com.neeraja.harrypotter.data.repository.RemoteDataSource
import com.neeraja.harrypotter.remote.api.HarryPotterService
import com.neeraja.harrypotter.remote.mapper.Mapper
import com.neeraja.harrypotter.remote.models.CharacterNetwork
import com.neeraja.harrypotter.remote.models.HouseNetwork
import io.reactivex.Observable
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
        private val houseMapper: Mapper<HouseData, HouseNetwork>,
        private val characterMapper: Mapper<CharacterData, CharacterNetwork>,
        private val potterService: HarryPotterService
) : RemoteDataSource {
    override fun getAllHouses(): Observable<List<HouseData>> {
        return potterService.getAllHousesInfo()
                .map { response ->
                    println("Remote Get All Houses Invoked")
                    response.housesInfo.map {
                        houseMapper.from(it)
                    }
                }
    }

    override fun getCharacterById(characterId: String): Observable<CharacterData> {
        return potterService.getCharacterById(characterId)
                .map { response ->
                    println("Remote Get character By Id invoked")
                    characterMapper.from(response.character)
                }
    }

    override fun getHouseById(houseId: String): Observable<HouseData> {
        return potterService.getHouseByIdInfo(houseId)
                .map { response ->
                    println("Remote Get character By Id invoked")
                    houseMapper.from(response.houseInfo)
                }
    }

}