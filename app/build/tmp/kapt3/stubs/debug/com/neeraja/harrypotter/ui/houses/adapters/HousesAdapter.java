package com.neeraja.harrypotter.ui.houses.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.neeraja.harrypotter.R;
import com.neeraja.harrypotter.presentation.models.House;
import kotlinx.android.synthetic.main.layout_house_list_item.view.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HousesViewHolder;", "listener", "Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HouseClickListener;", "(Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HouseClickListener;)V", "housesList", "", "Lcom/neeraja/harrypotter/presentation/models/House;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "populate", "houses", "", "HouseClickListener", "HousesViewHolder", "app_debug"})
public final class HousesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HousesViewHolder> {
    private final java.util.List<com.neeraja.harrypotter.presentation.models.House> housesList = null;
    private final com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HouseClickListener listener = null;
    
    public final void populate(@org.jetbrains.annotations.NotNull()
    java.util.List<com.neeraja.harrypotter.presentation.models.House> houses) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HousesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HousesViewHolder holder, int position) {
    }
    
    public HousesAdapter(@org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter.HouseClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HousesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter;Landroid/view/View;)V", "bind", "", "house", "Lcom/neeraja/harrypotter/presentation/models/House;", "app_debug"})
    public final class HousesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.neeraja.harrypotter.presentation.models.House house) {
        }
        
        public HousesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/neeraja/harrypotter/ui/houses/adapters/HousesAdapter$HouseClickListener;", "", "onHouseClick", "", "house", "Lcom/neeraja/harrypotter/presentation/models/House;", "app_debug"})
    public static abstract interface HouseClickListener {
        
        public abstract void onHouseClick(@org.jetbrains.annotations.NotNull()
        com.neeraja.harrypotter.presentation.models.House house);
    }
}