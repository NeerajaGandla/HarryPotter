package com.neeraja.harrypotter.remote.mapper

import com.neeraja.harrypotter.data.models.CharacterData
import com.neeraja.harrypotter.remote.models.CharacterNetwork
import javax.inject.Inject

class CharacterDataNetworkMapper @Inject constructor() : Mapper<CharacterData, CharacterNetwork> {
    override fun from(e: CharacterNetwork): CharacterData {
        return CharacterData(e.id,
                e.name, e.role, e.__v, e.ministryOfMagic,
                e.orderOfThePhoenix, e.dumbledoresArmy, e.deathEater, e.bloodStatus,
                e.species)
    }

    override fun to(t: CharacterData): CharacterNetwork {
        return CharacterNetwork(t.id, t.name, t.role, t.__v, t.isMinistryOfMagic, t.isOrderOfThePhoenix,
                t.isDumbledoresArmy, t.isDeathEater, t.bloodStatus, t.species)    }
}