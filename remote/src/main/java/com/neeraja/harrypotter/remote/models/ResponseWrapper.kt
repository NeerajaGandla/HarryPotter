package com.neeraja.harrypotter.remote.models

import com.google.gson.annotations.SerializedName

class ResponseWrapper (
        @SerializedName("houses-info") val housesInfo: List<HouseNetwork>,
        @SerializedName("house-info") val houseInfo : HouseNetwork,
        @SerializedName("characters") val character: CharacterNetwork
)