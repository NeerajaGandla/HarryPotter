package com.neeraja.harrypotter.di

import android.app.Application
import com.neeraja.harrypotter.application.HarryPotterApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules =
[AndroidInjectionModule::class,
    DomainModule::class,
    DataModule::class,
    RemoteModule::class,
    IdentityModule::class,
    PresentationModule::class,
    AppModule::class])
interface HarryPotterAppComponent : AndroidInjector<HarryPotterApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application) : Builder

        fun build(): HarryPotterAppComponent
    }

    override fun inject(app: HarryPotterApp)
}