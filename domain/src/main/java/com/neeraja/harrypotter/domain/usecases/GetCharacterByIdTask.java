package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.qualifiers.Background;
import com.neeraja.harrypotter.domain.qualifiers.Foreground;
import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import com.neeraja.harrypotter.domain.usecases.base.ObservableUsecase;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

public class GetCharacterByIdTask extends ObservableUsecase<CharacterEntity, GetCharacterByIdTask.Params> {

    private HogwartsRepository hogwartsRepository;
    @Foreground
    Scheduler foregroundScheduler;
    @Background
    Scheduler backgroundScheduler;

    @Inject
    public GetCharacterByIdTask (HogwartsRepository hogwartsRepository,@Foreground Scheduler foregroundScheduler,@Background Scheduler backgroundScheduler) {
        super(foregroundScheduler, backgroundScheduler);
        this.hogwartsRepository = hogwartsRepository;
        this.foregroundScheduler = foregroundScheduler;
        this.backgroundScheduler = backgroundScheduler;
    }

    @Override
    protected Observable generateObservable(Params params) {
        if (params == null) {
            throw new IllegalArgumentException("FilterTransactionsTask parameter can't be null");
        }
        return hogwartsRepository.getCharacterByID(params.apiKey, params.characterId)
                .subscribeOn(backgroundScheduler)
                .observeOn(foregroundScheduler);
    }

   public static class Params {
        public String apiKey;
        public String characterId;

       public Params(String apiKey, String characterId) {
           this.apiKey = apiKey;
           this.characterId = characterId;
       }
   }
}
