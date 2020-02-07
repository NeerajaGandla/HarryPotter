package com.neeraja.harrypotter.di

import com.neeraja.harrypotter.application.HarryPotterApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules =
[AndroidInjectionModule::class,
    DomainModule::class,
    DataModule::class,
    RemoteModule::class,
    IdentityModule::class,
    PresentationModule::class,
    AppModule::class])
interface HarryPotterAppComponent : AndroidInjector<HarryPotterApp> {


}