package com.neeraja.harrypotter.di

import android.app.Application
import android.content.Context
import com.neeraja.harrypotter.ui.houses.HousesActivity
import com.neeraja.harrypotter.ui.houses.fragments.HousesFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application) : Context

    @ContributesAndroidInjector
    internal abstract fun contributesHousesActivity(): HousesActivity

    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): HousesFragment
}