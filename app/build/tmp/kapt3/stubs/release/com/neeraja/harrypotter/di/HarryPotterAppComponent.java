package com.neeraja.harrypotter.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/neeraja/harrypotter/di/HarryPotterAppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/neeraja/harrypotter/application/HarryPotterApp;", "app_release"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.neeraja.harrypotter.di.DomainModule.class, com.neeraja.harrypotter.di.DataModule.class, com.neeraja.harrypotter.di.RemoteModule.class, com.neeraja.harrypotter.di.IdentityModule.class, com.neeraja.harrypotter.di.PresentationModule.class, com.neeraja.harrypotter.di.AppModule.class})
public abstract interface HarryPotterAppComponent extends dagger.android.AndroidInjector<com.neeraja.harrypotter.application.HarryPotterApp> {
}