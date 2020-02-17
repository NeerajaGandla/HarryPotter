package com.neeraja.harrypotter.remote.api

import com.neeraja.harrypotter.remote.models.HouseNetwork
import com.neeraja.harrypotter.remote.models.ResponseWrapper
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HarryPotterService {

    @GET("houses")
    fun getAllHousesInfo(@Query("key") key: String) : Observable<ResponseWrapper>

    @GET("houses/{houseId}")
    fun getHouseByIdInfo(@Query("key") key: String, @Path("houseId") houseId : String) : Observable<ResponseWrapper>

    @GET("characters/{characterId}")
    fun getCharacterById(@Query("key") key: String, @Path("characterId") characterId : String) : Observable<ResponseWrapper>
}