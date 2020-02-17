package com.neeraja.harrypotter.ui.houses;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.neeraja.harrypotter.R;
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory;
import com.neeraja.harrypotter.presentation.models.House;
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel;
import com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter;
import com.neeraja.harrypotter.ui.houses.fragments.HouseDetailFragment;
import com.neeraja.harrypotter.ui.houses.fragments.HousesFragment;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/HousesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/HasAndroidInjector;", "()V", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "sharedViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "getSharedViewModel", "()Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "setSharedViewModel", "(Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;)V", "viewModelFactory", "Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;)V", "androidInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "subscribeObservers", "app_debug"})
public final class HousesActivity extends androidx.appcompat.app.AppCompatActivity implements dagger.android.HasAndroidInjector {
    @org.jetbrains.annotations.NotNull()
    public com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.neeraja.harrypotter.presentation.factory.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> dispatchingAndroidInjector;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel getSharedViewModel() {
        return null;
    }
    
    public final void setSharedViewModel(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.factory.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeObservers() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    public HousesActivity() {
        super();
    }
}