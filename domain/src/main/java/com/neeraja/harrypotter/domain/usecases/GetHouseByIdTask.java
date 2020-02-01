package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.qualifiers.Background;
import com.neeraja.harrypotter.domain.qualifiers.Foreground;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.usecases.base.ObservableUsecase;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class GetHouseByIdTask extends ObservableUsecase<HouseEntity, GetHouseByIdTask.Params> {
    private HogwartsRepository hogwartsRepository;
    @Foreground
    Scheduler foregroundScheduler;
    @Background
    Scheduler backgroundScheduler;

    @Inject
    public GetHouseByIdTask(HogwartsRepository hogwartsRepository, Scheduler foregroundScheduler, Scheduler backgroundScheduler) {
        super(foregroundScheduler, backgroundScheduler);
        this.hogwartsRepository = hogwartsRepository;
        this.foregroundScheduler = foregroundScheduler;
        this.backgroundScheduler = backgroundScheduler;
    }

    @Override
    protected Observable generateObservable(Params params) {
        return null;
    }

    class Params {
        String apiKey;
        String houseId;
    }
}