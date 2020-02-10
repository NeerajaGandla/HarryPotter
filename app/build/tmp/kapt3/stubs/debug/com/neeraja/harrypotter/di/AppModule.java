package com.neeraja.harrypotter.di;

import android.app.Application;
import android.content.Context;
import com.neeraja.harrypotter.ui.houses.HousesActivity;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/neeraja/harrypotter/di/AppModule;", "", "()V", "bindContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "contributesHousesActivity", "Lcom/neeraja/harrypotter/ui/houses/HousesActivity;", "contributesHousesActivity$app_debug", "app_debug"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.content.Context bindContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.neeraja.harrypotter.ui.houses.HousesActivity contributesHousesActivity$app_debug();
    
    public AppModule() {
        super();
    }
}