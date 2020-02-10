package com.neeraja.harrypotter.data.mapper;

import com.neeraja.harrypotter.data.models.CharacterData;
import com.neeraja.harrypotter.domain.entities.CharacterEntity;

import javax.inject.Inject;

public class CharacterDomainDataMapper implements Mapper<CharacterEntity, CharacterData> {
    @Inject
    public CharacterDomainDataMapper() {

    }
    @Override
    public CharacterEntity from(CharacterData obj) {
        return new CharacterEntity(obj.getId(), obj.getName(), obj.getRole(), obj.get__v(),
                obj.isMinistryOfMagic(), obj.isOrderOfThePhoenix(), obj.isDumbledoresArmy(),
                obj.isDeathEater(), obj.getBloodStatus(), obj.getSpecies());
    }

    @Override
    public CharacterData to(CharacterEntity obj) {
        return new CharacterData(obj.getId(), obj.getName(), obj.getRole(),
                obj.get__v(), obj.isMinistryOfMagic(), obj.isOrderOfThePhoenix(),
                obj.isDumbledoresArmy(), obj.isDeathEater(), obj.getBloodStatus(),
                obj.getSpecies());
    }
}
