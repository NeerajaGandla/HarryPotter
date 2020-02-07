package com.neeraja.harrypotter.di

import com.neeraja.harrypotter.BuildConfig
import com.neeraja.harrypotter.presentation.qualifiers.UserIdentity
import dagger.Module
import dagger.Provides

@Module
class IdentityModule {

    @Provides
    @UserIdentity
    fun provideApiKey() : String = BuildConfig.API_KEY
}