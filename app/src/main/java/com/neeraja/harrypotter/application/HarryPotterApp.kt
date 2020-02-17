package com.neeraja.harrypotter.application

import android.app.Activity
import com.neeraja.harrypotter.di.DaggerHarryPotterAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class HarryPotterApp : DaggerApplication(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerHarryPotterAppComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()
        DaggerHarryPotterAppComponent.builder()
                .application(this)
                .build()
                .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}