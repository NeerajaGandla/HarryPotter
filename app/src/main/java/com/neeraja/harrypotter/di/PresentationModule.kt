package com.neeraja.harrypotter.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.neeraja.harrypotter.domain.entities.CharacterEntity
import com.neeraja.harrypotter.domain.entities.HouseEntity
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory
import com.neeraja.harrypotter.presentation.mapper.CharacterEntityMapper
import com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper
import com.neeraja.harrypotter.presentation.mapper.Mapper
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.viewmodels.CharacterViewModel
import com.neeraja.harrypotter.presentation.viewmodels.HouseDetailViewModel
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class PresentationModule {

    @Binds
    abstract fun bindsViewModelFactory(
            factory: ViewModelFactory
    ): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HousesViewModel::class)
    abstract fun bindsHousesViewModel(housesViewModel: HousesViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HouseDetailViewModel::class)
    abstract fun bindsHouseDetailsViewModel(houseDetailsViewModel: HouseDetailViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CharacterViewModel::class)
    abstract fun bindsCharacterViewModel(characterViewModel: CharacterViewModel) : ViewModel

    @Binds
    abstract fun bindsHouseMapper(
            houseEntityMapper: HouseEntityMapper
    ): Mapper<HouseEntity, House>

    @Binds
    abstract fun bindsCharacterMapper(
            characterEntityMapper: CharacterEntityMapper
    ) : Mapper<CharacterEntity, Character>
}