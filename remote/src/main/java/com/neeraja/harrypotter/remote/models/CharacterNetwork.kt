package com.neeraja.harrypotter.remote.models

import com.google.gson.annotations.SerializedName

data class CharacterNetwork (
        @SerializedName("id") val id : String,
        @SerializedName("name") val name : String,
        @SerializedName("role") val role : String,
        @SerializedName("__v") val __v : Int,
        @SerializedName("ministryOfMagic") val ministryOfMagic : Boolean,
        @SerializedName("orderOfThePhoenix") val orderOfThePhoenix : Boolean,
        @SerializedName("dumbledoresArmy") val dumbledoresArmy : Boolean,
        @SerializedName("deathEater") val deathEater : Boolean,
        @SerializedName("bloodStatus") val bloodStatus : String,
        @SerializedName("species") val species : String
)