package com.neeraja.harrypotter.ui.houses.fragments;

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
import dagger.android.support.DaggerFragment;
import kotlinx.android.synthetic.main.activity_houses.*;
import kotlinx.android.synthetic.main.fragment_houses.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/fragments/HousesFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HouseClickListener;", "()V", "housesAdapter", "Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter;", "sharedViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "viewModelFactory", "Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;)V", "hideLoader", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHouseClick", "house", "Lcom/neeraja/harrypotter/presentation/models/House;", "onViewCreated", "view", "showLoader", "app_debug"})
public final class HousesFragment extends dagger.android.support.DaggerFragment implements com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HouseClickListener {
    private com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.neeraja.harrypotter.presentation.factory.ViewModelFactory viewModelFactory;
    private final com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter housesAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.presentation.factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.factory.ViewModelFactory p0) {
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