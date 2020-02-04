package com.neeraja.harrypotter.remote.api

import com.neeraja.harrypotter.remote.models.ResponseWrapper
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HarryPotterService {

    @GET("houses")
    fun getAllHousesInfo() : Observable<ResponseWrapper>

    @GET("houses/{houseId}")
    fun getHouseByIdInfo(@Path("houseId") houseId : String) : Observable<ResponseWrapper>

    @GET("characters/{characterId}")
    fun getCharacterById(@Path("characterId") characterId : String) : Observable<ResponseWrapper>
}