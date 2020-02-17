package com.neeraja.harrypotter.remote.models

class ResponseWrapper (
        val housesInfo: List<HouseNetwork>,
        val houseInfo : HouseNetwork,
        val character: CharacterNetwork
)