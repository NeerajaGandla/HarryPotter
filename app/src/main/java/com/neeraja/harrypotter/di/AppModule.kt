package com.neeraja.harrypotter.di

import android.app.Application
import android.content.Context
import com.neeraja.harrypotter.ui.HousesActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application) : Context

    @ContributesAndroidInjector
    internal abstract fun contributesHousesActivity(): HousesActivity


}