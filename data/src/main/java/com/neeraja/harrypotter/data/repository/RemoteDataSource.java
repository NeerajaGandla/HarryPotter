package com.neeraja.harrypotter.data.repository;


import com.neeraja.harrypotter.data.models.CharacterData;
import com.neeraja.harrypotter.data.models.HouseData;

import java.util.List;

import io.reactivex.Observable;

public interface RemoteDataSource {
    Observable<HouseData> getHouseById(String houseId);

    Observable<List<HouseData>> getAllHouses();

    Observable<CharacterData> getCharacterById(String characterId);
}
