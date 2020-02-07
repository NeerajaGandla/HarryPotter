package com.neeraja.harrypotter.di

import com.neeraja.harrypotter.data.mapper.CharacterDomainDataMapper
import com.neeraja.harrypotter.data.mapper.HouseDomainDataMapper
import com.neeraja.harrypotter.data.mapper.Mapper
import com.neeraja.harrypotter.data.models.CharacterData
import com.neeraja.harrypotter.data.models.HouseData
import com.neeraja.harrypotter.data.repository.HogwartsRepositoryImpl
import com.neeraja.harrypotter.domain.entities.CharacterEntity
import com.neeraja.harrypotter.domain.entities.HouseEntity
import com.neeraja.harrypotter.domain.repository.HogwartsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {
    @Binds
    abstract fun bindsRepository(
            repoImpl: HogwartsRepositoryImpl
    ) : HogwartsRepository

    @Binds
    abstract fun bindsCharacterMapper(
            mapper: CharacterDomainDataMapper
    ): Mapper<CharacterEntity, CharacterData>

    @Binds
    abstract fun bindsHouseMapper(
            mapper: HouseDomainDataMapper
    ): Mapper<HouseEntity, HouseData>
}