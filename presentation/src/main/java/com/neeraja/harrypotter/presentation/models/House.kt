package com.neeraja.harrypotter.presentation.models

data class House (
        val id : String,
        val name : String,
        val mascot : String,
        val headOfHouse : String,
        val houseGhost : String,
        val founder : String,
        val __v : Int,
        val school : String,
        val members : Array<Member>,
        val values: Array<String>,
        val colors: Array<String>
)