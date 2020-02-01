package com.neeraja.harrypotter.domain.repository;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;

import java.util.List;

import io.reactivex.Observable;

public interface HogwartsRepository {

    Observable<List<HouseEntity>> getAllHouses(String apiKey);

    Observable<HouseEntity> getHouseByID(String apiKey, String houseId);

    Observable<CharacterEntity> getCharacterByID(String apiKey, String characterId);
}
