package com.neeraja.harrypotter.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.entities.MemberEntity;
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory;
import com.neeraja.harrypotter.presentation.mapper.CharacterEntityMapper;
import com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper;
import com.neeraja.harrypotter.presentation.mapper.Mapper;
import com.neeraja.harrypotter.presentation.mapper.MemberEntityMapper;
import com.neeraja.harrypotter.presentation.models.Character;
import com.neeraja.harrypotter.presentation.models.House;
import com.neeraja.harrypotter.presentation.models.Member;
import com.neeraja.harrypotter.presentation.viewmodels.CharacterViewModel;
import com.neeraja.harrypotter.presentation.viewmodels.HouseDetailViewModel;
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import javax.inject.Named;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\'J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\'\u00a8\u0006!"}, d2 = {"Lcom/neeraja/harrypotter/di/PresentationModule;", "", "()V", "bindsCharacterMapper", "Lcom/neeraja/harrypotter/presentation/mapper/Mapper;", "Lcom/neeraja/harrypotter/domain/entities/CharacterEntity;", "Lcom/neeraja/harrypotter/presentation/models/Character;", "characterEntityMapper", "Lcom/neeraja/harrypotter/presentation/mapper/CharacterEntityMapper;", "bindsCharacterViewModel", "Landroidx/lifecycle/ViewModel;", "characterViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/CharacterViewModel;", "bindsHouseDetailsViewModel", "houseDetailsViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HouseDetailViewModel;", "bindsHouseMapper", "Lcom/neeraja/harrypotter/domain/entities/HouseEntity;", "Lcom/neeraja/harrypotter/presentation/models/House;", "houseEntityMapper", "Lcom/neeraja/harrypotter/presentation/mapper/HouseEntityMapper;", "bindsHousesViewModel", "housesViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "bindsMemberMapper", "Lcom/neeraja/harrypotter/domain/entities/MemberEntity;", "Lcom/neeraja/harrypotter/presentation/models/Member;", "memberEntityMapper", "Lcom/neeraja/harrypotter/presentation/mapper/MemberEntityMapper;", "bindsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindsViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.factory.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsHousesViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel housesViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.neeraja.harrypotter.presentation.viewmodels.HouseDetailViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsHouseDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.viewmodels.HouseDetailViewModel houseDetailsViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.neeraja.harrypotter.presentation.viewmodels.CharacterViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsCharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.viewmodels.CharacterViewModel characterViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.neeraja.harrypotter.presentation.mapper.Mapper<com.neeraja.harrypotter.domain.entities.HouseEntity, com.neeraja.harrypotter.presentation.models.House> bindsHouseMapper(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper houseEntityMapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.neeraja.harrypotter.presentation.mapper.Mapper<com.neeraja.harrypotter.domain.entities.CharacterEntity, com.neeraja.harrypotter.presentation.models.Character> bindsCharacterMapper(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.mapper.CharacterEntityMapper characterEntityMapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.neeraja.harrypotter.presentation.mapper.Mapper<com.neeraja.harrypotter.domain.entities.MemberEntity, com.neeraja.harrypotter.presentation.models.Member> bindsMemberMapper(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.mapper.MemberEntityMapper memberEntityMapper);
    
    public PresentationModule() {
        super();
    }
}