package com.neeraja.harrypotter.ui.houses;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.neeraja.harrypotter.R;
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory;
import com.neeraja.harrypotter.presentation.models.House;
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel;
import com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter;
import com.neeraja.harrypotter.ui.houses.fragments.HouseDetailFragment;
import com.neeraja.harrypotter.ui.houses.fragments.HousesFragment;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/HousesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "sharedViewModel", "Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "getSharedViewModel", "()Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "setSharedViewModel", "(Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;)V", "viewModelFactory", "Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/neeraja/harrypotter/presentation/factory/ViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "subscribeObservers", "app_debug"})
public final class HousesActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.neeraja.harrypotter.presentation.factory.ViewModelFactory viewModelFactory;
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeObservers() {
    }
    
    public HousesActivity() {
        super();
    }
}