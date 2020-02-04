package com.neeraja.harrypotter.domain.repository;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;

import java.util.List;

import io.reactivex.Observable;

public interface HogwartsRepository {

    Observable<List<HouseEntity>> getAllHouses();

    Observable<HouseEntity> getHouseByID(String houseId);

    Observable<CharacterEntity> getCharacterByID(String characterId);
}
