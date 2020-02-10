package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.HouseEntity;
import com.neeraja.harrypotter.domain.qualifiers.Background;
import com.neeraja.harrypotter.domain.qualifiers.Foreground;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.usecases.base.ObservableUsecase;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class GetAllHousesTask extends ObservableUsecase<List<HouseEntity>, String> {
    private HogwartsRepository hogwartsRepository;

    @Foreground
    Scheduler foregroundScheduler;

    @Background
    Scheduler backgroundScheduler;

    @Inject
    public GetAllHousesTask(HogwartsRepository hogwartsRepository, @Foreground Scheduler foregroundScheduler, @Background Scheduler backgroundScheduler) {
        super(foregroundScheduler, backgroundScheduler);
        this.hogwartsRepository = hogwartsRepository;
        this.foregroundScheduler = foregroundScheduler;
        this.backgroundScheduler = backgroundScheduler;
    }

    @Override
    protected Observable<List<HouseEntity>> generateObservable(String input) {
        return hogwartsRepository.getAllHouses(input);
    }
}
