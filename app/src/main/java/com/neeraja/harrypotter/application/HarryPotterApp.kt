package com.neeraja.harrypotter.application

import com.neeraja.harrypotter.di.DaggerHarryPotterAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class HarryPotterApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerHarryPotterAppComponent.builder().application(this).build()
    }
}