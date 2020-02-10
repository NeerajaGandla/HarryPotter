package com.neeraja.harrypotter.di;

import com.neeraja.harrypotter.domain.qualifiers.Background;
import com.neeraja.harrypotter.domain.qualifiers.Foreground;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lcom/neeraja/harrypotter/di/DomainModule;", "", "()V", "providesBackgroundScheduler", "Lio/reactivex/Scheduler;", "providesForegroundScheduler", "app_debug"})
@dagger.Module()
public final class DomainModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.neeraja.harrypotter.domain.qualifiers.Background()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final io.reactivex.Scheduler providesBackgroundScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.neeraja.harrypotter.domain.qualifiers.Foreground()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final io.reactivex.Scheduler providesForegroundScheduler() {
        return null;
    }
    
    public DomainModule() {
        super();
    }
}