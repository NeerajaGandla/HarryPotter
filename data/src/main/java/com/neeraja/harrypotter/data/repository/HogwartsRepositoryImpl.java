package com.neeraja.harrypotter.data.repository;

import com.neeraja.harrypotter.data.mapper.Mapper;
import com.neeraja.harrypotter.data.models.CharacterData;
import com.neeraja.harrypotter.data.models.HouseData;
import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class HogwartsRepositoryImpl implements HogwartsRepository {
    private Mapper<HouseEntity, HouseData> houseMapper;
    private Mapper<CharacterEntity, CharacterData> characterMapper;
    private RemoteDataSource remoteDataSource;

    @Inject
    public HogwartsRepositoryImpl(Mapper<HouseEntity, HouseData> houseMapper,
                                  Mapper<CharacterEntity, CharacterData> characterMapper,
                                  RemoteDataSource remoteDataSource) {
        this.houseMapper = houseMapper;
        this.characterMapper = characterMapper;
        this.remoteDataSource = remoteDataSource;
    }

    @Override
    public Observable<List<HouseEntity>> getAllHouses(String apiKey) {
        final List<HouseEntity> houseEntities = new ArrayList<>();
        Observable observable = remoteDataSource.getAllHouses(apiKey).map((Function) (new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                return this.apply((List) o);
            }

            public final List apply(List houses) {
                for (Object houseData : houses) {
                    HouseEntity houseEntity = houseMapper.from((HouseData) houseData);
                    houseEntities.add(houseEntity);
                }
                return houseEntities;
            }
        })).onErrorResumeNext(Observable.empty());
        return observable;
    }

    @Override
    public Observable<HouseEntity> getHouseByID(String apiKey, String houseId) {
        Observable observable = remoteDataSource.getHouseById(apiKey, houseId).map((Function) (new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                return this.apply((List) o);
            }

            public final HouseEntity apply(HouseData houseData) {
                HouseEntity houseEntity = houseMapper.from((HouseData) houseData);
                return houseEntity;
            }
        })).onErrorResumeNext(Observable.empty());
        return observable;
    }

    @Override
    public Observable<CharacterEntity> getCharacterByID(String apiKey, String characterId) {
        Observable observable = remoteDataSource.getCharacterById(apiKey, characterId).map((Function) (new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                return this.apply((List) o);
            }

            public final CharacterEntity apply(CharacterData characterData) {
                CharacterEntity characterEntity = characterMapper.from((CharacterData) characterData);
                return characterEntity;
            }
        })).onErrorResumeNext(Observable.empty());
        return observable;
    }
}
