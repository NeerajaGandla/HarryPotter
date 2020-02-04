package com.neeraja.harrypotter.presentation.mapper

import com.neeraja.harrypotter.domain.entities.CharacterEntity
import com.neeraja.harrypotter.presentation.models.Character
import javax.inject.Inject

class CharacterEntityMapper @Inject constructor() : Mapper<CharacterEntity, Character> {
    override fun from(e: Character): CharacterEntity {
        return CharacterEntity(e.id,
                e.name, e.role, e.__v, e.ministryOfMagic,
                e.orderOfThePhoenix, e.dumbledoresArmy, e.deathEater, e.bloodStatus,
                e.species)
    }

    override fun to(t: CharacterEntity): Character {
        return Character(t.id, t.name, t.role, t.__v, t.isMinistryOfMagic, t.isOrderOfThePhoenix,
                t.isDumbledoresArmy, t.isDeathEater, t.bloodStatus, t.species)
    }
}