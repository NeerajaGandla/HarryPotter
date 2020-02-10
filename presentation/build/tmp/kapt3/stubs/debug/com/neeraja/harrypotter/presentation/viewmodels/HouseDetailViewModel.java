package com.neeraja.harrypotter.presentation.viewmodels;

import java.lang.System;

/**
 * this ViewModel is currently not in use
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/neeraja/harrypotter/presentation/viewmodels/HouseDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "userIdentifier", "", "mapper", "Lcom/neeraja/harrypotter/presentation/mapper/Mapper;", "Lcom/neeraja/harrypotter/domain/entities/HouseEntity;", "Lcom/neeraja/harrypotter/presentation/models/House;", "getHouseByIdTask", "Lcom/neeraja/harrypotter/domain/usecases/GetHouseByIdTask;", "(Ljava/lang/String;Lcom/neeraja/harrypotter/presentation/mapper/Mapper;Lcom/neeraja/harrypotter/domain/usecases/GetHouseByIdTask;)V", "getGetHouseByIdTask", "()Lcom/neeraja/harrypotter/domain/usecases/GetHouseByIdTask;", "houseByIdResource", "Landroidx/lifecycle/LiveData;", "Lcom/neeraja/harrypotter/presentation/models/Resource;", "getHouseByIdResource", "()Landroidx/lifecycle/LiveData;", "houseId", "getHouseId", "()Ljava/lang/String;", "presentation_debug"})
public final class HouseDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String houseId = "";
    private final java.lang.String userIdentifier = null;
    private final com.neeraja.harrypotter.presentation.mapper.Mapper<com.neeraja.harrypotter.domain.entities.HouseEntity, com.neeraja.harrypotter.presentation.models.House> mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask getHouseByIdTask = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHouseId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.neeraja.harrypotter.presentation.models.Resource<com.neeraja.harrypotter.presentation.models.House>> getHouseByIdResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask getGetHouseByIdTask() {
        return null;
    }
    
    @javax.inject.Inject()
    public HouseDetailViewModel(@org.jetbrains.annotations.NotNull()
    @com.neeraja.harrypotter.presentation.qualifiers.UserIdentity()
    java.lang.String userIdentifier, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.presentation.mapper.Mapper<com.neeraja.harrypotter.domain.entities.HouseEntity, com.neeraja.harrypotter.presentation.models.House> mapper, @org.jetbrains.annotations.NotNull()
    com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask getHouseByIdTask) {
        super();
    }
}