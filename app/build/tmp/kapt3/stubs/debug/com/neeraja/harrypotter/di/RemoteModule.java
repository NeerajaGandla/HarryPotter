package com.neeraja.harrypotter.di;

import com.neeraja.harrypotter.BuildConfig;
import com.neeraja.harrypotter.data.models.CharacterData;
import com.neeraja.harrypotter.data.models.HouseData;
import com.neeraja.harrypotter.data.repository.RemoteDataSource;
import com.neeraja.harrypotter.remote.api.HarryPotterService;
import com.neeraja.harrypotter.remote.mapper.CharacterDataNetworkMapper;
import com.neeraja.harrypotter.remote.mapper.HouseDataNetworkMapper;
import com.neeraja.harrypotter.remote.mapper.Mapper;
import com.neeraja.harrypotter.remote.models.CharacterNetwork;
import com.neeraja.harrypotter.remote.models.HouseNetwork;
import com.neeraja.harrypotter.remote.source.RemoteDataSourceImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/neeraja/harrypotter/di/RemoteModule;", "", "()V", "providesHarryPotterService", "Lcom/neeraja/harrypotter/remote/api/HarryPotterService;", "retrofit", "Lretrofit2/Retrofit;", "providesRetrofit", "Binders", "app_debug"})
@dagger.Module(includes = {com.neeraja.harrypotter.di.RemoteModule.Binders.class})
public final class RemoteModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.neeraja.harrypotter.remote.api.HarryPotterService providesHarryPotterService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit() {
        return null;
    }
    
    public RemoteModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/neeraja/harrypotter/di/RemoteModule$Binders;", "", "bindCharacterMapper", "Lcom/neeraja/harrypotter/remote/mapper/Mapper;", "Lcom/neeraja/harrypotter/data/models/CharacterData;", "Lcom/neeraja/harrypotter/remote/models/CharacterNetwork;", "characterMapper", "Lcom/neeraja/harrypotter/remote/mapper/CharacterDataNetworkMapper;", "bindHouseMapper", "Lcom/neeraja/harrypotter/data/models/HouseData;", "Lcom/neeraja/harrypotter/remote/models/HouseNetwork;", "houseMapper", "Lcom/neeraja/harrypotter/remote/mapper/HouseDataNetworkMapper;", "bindsRemoteSource", "Lcom/neeraja/harrypotter/data/repository/RemoteDataSource;", "remoteDataSourceImpl", "Lcom/neeraja/harrypotter/remote/source/RemoteDataSourceImpl;", "app_debug"})
    @dagger.Module()
    public static abstract interface Binders {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.neeraja.harrypotter.data.repository.RemoteDataSource bindsRemoteSource(@org.jetbrains.annotations.NotNull()
        com.neeraja.harrypotter.remote.source.RemoteDataSourceImpl remoteDataSourceImpl);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.neeraja.harrypotter.remote.mapper.Mapper<com.neeraja.harrypotter.data.models.CharacterData, com.neeraja.harrypotter.remote.models.CharacterNetwork> bindCharacterMapper(@org.jetbrains.annotations.NotNull()
        com.neeraja.harrypotter.remote.mapper.CharacterDataNetworkMapper characterMapper);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract com.neeraja.harrypotter.remote.mapper.Mapper<com.neeraja.harrypotter.data.models.HouseData, com.neeraja.harrypotter.remote.models.HouseNetwork> bindHouseMapper(@org.jetbrains.annotations.NotNull()
        com.neeraja.harrypotter.remote.mapper.HouseDataNetworkMapper houseMapper);
    }
}