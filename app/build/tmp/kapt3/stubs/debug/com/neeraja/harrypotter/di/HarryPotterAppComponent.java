package com.neeraja.harrypotter.di;

import android.app.Application;
import com.neeraja.harrypotter.application.HarryPotterApp;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lcom/neeraja/harrypotter/di/HarryPotterAppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/neeraja/harrypotter/application/HarryPotterApp;", "inject", "", "app", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.neeraja.harrypotter.di.DomainModule.class, com.neeraja.harrypotter.di.DataModule.class, com.neeraja.harrypotter.di.RemoteModule.class, com.neeraja.harrypotter.di.IdentityModule.class, com.neeraja.harrypotter.di.PresentationModule.class, com.neeraja.harrypotter.di.AppModule.class})
@javax.inject.Singleton()
public abstract interface HarryPotterAppComponent extends dagger.android.AndroidInjector<com.neeraja.harrypotter.application.HarryPotterApp> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.application.HarryPotterApp app);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/neeraja/harrypotter/di/HarryPotterAppComponent$Builder;", "", "application", "app", "Landroid/app/Application;", "build", "Lcom/neeraja/harrypotter/di/HarryPotterAppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.neeraja.harrypotter.di.HarryPotterAppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application app);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.neeraja.harrypotter.di.HarryPotterAppComponent build();
    }
}