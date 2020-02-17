package com.neeraja.harrypotter.ui.houses.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.neeraja.harrypotter.R;
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory;
import com.neeraja.harrypotter.presentation.models.House;
import com.neeraja.harrypotter.presentation.models.Status;
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel;
import com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;
import kotlinx.android.synthetic.main.activity_houses.*;
import kotlinx.android.synthetic.main.fragment_houses.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020\u0018H\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006*"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/fragments/HousesFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HouseClickListener;", "Ldagger/android/HasAndroidInjector;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "housesAdapter", "Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter;", "sharedViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "viewModelFactory", "Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;)V", "Ldagger/android/AndroidInjector;", "hideLoader", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHouseClick", "house", "Lcom/neeraja/harrypotter/presentation/models/House;", "onViewCreated", "view", "showLoader", "app_debug"})
public final class HousesFragment extends dagger.android.support.DaggerFragment implements com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HouseClickListener, dagger.android.HasAndroidInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidInjector;
    private com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.neeraja.harrypotter.presentation.factory.ViewModelFactory viewModelFactory;
    private final com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter housesAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getAndroidInjector() {
        return null;
    }
    
    public final void setAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.factory.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showLoader() {
    }
    
    private final void hideLoader() {
    }
    
    @java.lang.Override()
    public void onHouseClick(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.models.House house) {
    }
    
    public HousesFragment() {
        super();
    }
}