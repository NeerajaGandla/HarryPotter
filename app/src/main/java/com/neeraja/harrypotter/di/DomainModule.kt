package com.neeraja.harrypotter.di

import com.neeraja.harrypotter.domain.qualifiers.Background
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

@Module
class DomainModule {
    @Singleton
    @Provides
    @Background
    fun providesBackgroundScheduler() : Scheduler {
        return Schedulers.io()
    }

    @Singleton
    @Provides
    @Background
    fun providesForegroundScheduler() : Scheduler {
        return AndroidSchedulers.mainThread()
    }
}