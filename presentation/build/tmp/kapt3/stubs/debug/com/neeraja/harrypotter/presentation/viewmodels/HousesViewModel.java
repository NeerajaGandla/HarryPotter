package com.neeraja.harrypotter.presentation.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/neeraja/harrypotter/presentation/viewmodels/HousesViewModel;", "Landroidx/lifecycle/ViewModel;", "userIdentifier", "", "mapper", "Lcom/neeraja/harrypotter/presentation/mapper/HouseEntityMapper;", "getAllHousesTask", "Lcom/neeraja/harrypotter/domain/usecases/GetAllHousesTask;", "getHouseByIdTask", "Lcom/neeraja/harrypotter/domain/usecases/GetHouseByIdTask;", "(Ljava/lang/String;Lcom/neeraja/harrypotter/presentation/mapper/HouseEntityMapper;Lcom/neeraja/harrypotter/domain/usecases/GetAllHousesTask;Lcom/neeraja/harrypotter/domain/usecases/GetHouseByIdTask;)V", "getGetAllHousesTask", "()Lcom/neeraja/harrypotter/domain/usecases/GetAllHousesTask;", "getGetHouseByIdTask", "()Lcom/neeraja/harrypotter/domain/usecases/GetHouseByIdTask;", "houseByIdResource", "Landroidx/lifecycle/LiveData;", "Lcom/neeraja/harrypotter/presentation/models/Resource;", "Lcom/neeraja/harrypotter/presentation/models/House;", "getHouseByIdResource", "()Landroidx/lifecycle/LiveData;", "houseId", "Landroidx/lifecycle/MutableLiveData;", "getHouseId", "()Landroidx/lifecycle/MutableLiveData;", "housesResource", "", "getHousesResource", "presentation_debug"})
public final class HousesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> houseId = null;
    private final java.lang.String userIdentifier = null;
    private final com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.neeraja.harrypotter.domain.usecases.GetAllHousesTask getAllHousesTask = null;
    @org.jetbrains.annotations.NotNull()
    private final com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask getHouseByIdTask = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHouseId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.neeraja.harrypotter.presentation.models.Resource<java.util.List<com.neeraja.harrypotter.presentation.models.House>>> getHousesResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.neeraja.harrypotter.presentation.models.Resource<com.neeraja.harrypotter.presentation.models.House>> getHouseByIdResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.domain.usecases.GetAllHousesTask getGetAllHousesTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask getGetHouseByIdTask() {
        return null;
    }
    
    @javax.inject.Inject()
    public HousesViewModel(@org.jetbrains.annotations.NotNull()
    @com.neeraja.harrypotter.presentation.qualifiers.UserIdentity()
    java.lang.String userIdentifier, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper mapper, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.domain.usecases.GetAllHousesTask getAllHousesTask, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask getHouseByIdTask) {
        super();
    }
}