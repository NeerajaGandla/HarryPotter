package com.neeraja.harrypotter.di;

import com.neeraja.harrypotter.data.mapper.CharacterDomainDataMapper;
import com.neeraja.harrypotter.data.mapper.HouseDomainDataMapper;
import com.neeraja.harrypotter.data.mapper.Mapper;
import com.neeraja.harrypotter.data.models.CharacterData;
import com.neeraja.harrypotter.data.models.HouseData;
import com.neeraja.harrypotter.data.repository.HogwartsRepositoryImpl;
import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import dagger.Binds;
import dagger.Module;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\'J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0007\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/neeraja/harrypotter/di/DataModule;", "", "()V", "bindsCharacterMapper", "Lcom/neeraja/harrypotter/data/mapper/Mapper;", "Lcom/neeraja/harrypotter/domain/entities/CharacterEntity;", "Lcom/neeraja/harrypotter/data/models/CharacterData;", "mapper", "Lcom/neeraja/harrypotter/data/mapper/CharacterDomainDataMapper;", "bindsHouseMapper", "Lcom/neeraja/harrypotter/domain/entities/HouseEntity;", "Lcom/neeraja/harrypotter/data/models/HouseData;", "Lcom/neeraja/harrypotter/data/mapper/HouseDomainDataMapper;", "bindsRepository", "Lcom/neeraja/harrypotter/domain/repository/HogwartsRepository;", "repoImpl", "Lcom/neeraja/harrypotter/data/repository/HogwartsRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.neeraja.harrypotter.domain.repository.HogwartsRepository bindsRepository(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.data.repository.HogwartsRepositoryImpl repoImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.neeraja.harrypotter.data.mapper.Mapper<com.neeraja.harrypotter.domain.entities.CharacterEntity, com.neeraja.harrypotter.data.models.CharacterData> bindsCharacterMapper(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.data.mapper.CharacterDomainDataMapper mapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.neeraja.harrypotter.data.mapper.Mapper<com.neeraja.harrypotter.domain.entities.HouseEntity, com.neeraja.harrypotter.data.models.HouseData> bindsHouseMapper(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.data.mapper.HouseDomainDataMapper mapper);
    
    public DataModule() {
        super();
    }
}