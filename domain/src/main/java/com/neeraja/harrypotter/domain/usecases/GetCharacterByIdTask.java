package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.qualifiers.Background;
import com.neeraja.harrypotter.domain.qualifiers.Foreground;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.usecases.base.ObservableUsecase;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class GetCharacterByIdTask extends ObservableUsecase<CharacterEntity, String> {

    private HogwartsRepository hogwartsRepository;
    @Foreground
    Scheduler foregroundScheduler;
    @Background
    Scheduler backgroundScheduler;

    @Inject
    public GetCharacterByIdTask (HogwartsRepository hogwartsRepository, Scheduler foregroundScheduler, Scheduler backgroundScheduler) {
        super(foregroundScheduler, backgroundScheduler);
        this.hogwartsRepository = hogwartsRepository;
        this.foregroundScheduler = foregroundScheduler;
        this.backgroundScheduler = backgroundScheduler;
    }

    @Override
    protected Observable generateObservable(String characterId) {
        if (characterId == null) {
            throw new IllegalArgumentException("FilterTransactionsTask parameter can't be null");
        }
        return hogwartsRepository.getCharacterByID(characterId)
                .subscribeOn(backgroundScheduler)
                .observeOn(foregroundScheduler);
    }
}
