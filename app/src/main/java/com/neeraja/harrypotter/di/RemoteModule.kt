package com.neeraja.harrypotter.di

import com.neeraja.harrypotter.BuildConfig
import com.neeraja.harrypotter.data.models.CharacterData
import com.neeraja.harrypotter.data.models.HouseData
import com.neeraja.harrypotter.data.repository.RemoteDataSource
import com.neeraja.harrypotter.remote.api.HarryPotterService
import com.neeraja.harrypotter.remote.mapper.CharacterDataNetworkMapper
import com.neeraja.harrypotter.remote.mapper.HouseDataNetworkMapper
import com.neeraja.harrypotter.remote.mapper.Mapper
import com.neeraja.harrypotter.remote.models.CharacterNetwork
import com.neeraja.harrypotter.remote.models.HouseNetwork
import com.neeraja.harrypotter.remote.source.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient.Builder
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


@Module(includes = ([RemoteModule.Binders::class]))
class RemoteModule {

    @Module
    interface Binders {
        @Binds
        fun bindsRemoteSource (
                remoteDataSourceImpl: RemoteDataSourceImpl
        ) : RemoteDataSource

        @Binds
        fun bindCharacterMapper (
                characterMapper: CharacterDataNetworkMapper
        ) : Mapper<CharacterData, CharacterNetwork>

        @Binds
        fun bindHouseMapper(
                houseMapper: HouseDataNetworkMapper
        ) : Mapper<HouseData, HouseNetwork>
    }

    @Provides
    fun providesHarryPotterService(retrofit : Retrofit) : HarryPotterService =
            retrofit.create(HarryPotterService::class.java)

    @Provides
    fun providesRetrofit() : Retrofit {
        val logging = HttpLoggingInterceptor()
// set your desired log level
        // set your desired log level
        logging.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = Builder()
// add your other interceptors …

// add logging as last interceptor
        // add your other interceptors …
// add logging as last interceptor
        httpClient.addInterceptor(logging)
        return   Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .baseUrl(BuildConfig.BASE_URL)
                .build()
    }
}