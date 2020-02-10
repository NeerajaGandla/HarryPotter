package com.neeraja.harrypotter.ui.houses.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.neeraja.harrypotter.R;
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory;
import com.neeraja.harrypotter.presentation.models.House;
import com.neeraja.harrypotter.presentation.models.Status;
import com.neeraja.harrypotter.presentation.viewmodels.HouseDetailViewModel;
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel;
import dagger.android.support.DaggerFragment;
import kotlinx.android.synthetic.main.activity_houses.*;
import kotlinx.android.synthetic.main.fragment_house_details.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0012H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/fragments/HouseDetailFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "houseId", "", "getHouseId", "()Ljava/lang/String;", "setHouseId", "(Ljava/lang/String;)V", "sharedViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "viewModelFactory", "Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;)V", "hideLoader", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setData", "house", "Lcom/neeraja/harrypotter/presentation/models/House;", "showLoader", "app_debug"})
public final class HouseDetailFragment extends dagger.android.support.DaggerFragment {
    private com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.neeraja.harrypotter.presentation.factory.ViewModelFactory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public java.lang.String houseId;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.factory.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHouseId() {
        return null;
    }
    
    public final void setHouseId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setData(com.neeraja.harrypotter.presentation.models.House house) {
    }
    
    private final void showLoader() {
    }
    
    private final void hideLoader() {
    }
    
    public HouseDetailFragment() {
        super();
    }
}