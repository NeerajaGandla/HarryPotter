package com.neeraja.harrypotter.presentation.models

data class Character (
    val id : String,
    val name : String,
    val role : String,
    val __v : Int,
    val ministryOfMagic : Boolean,
    val orderOfThePhoenix : Boolean,
    val dumbledoresArmy : Boolean,
    val deathEater : Boolean,
    val bloodStatus : String,
    val species : String
)