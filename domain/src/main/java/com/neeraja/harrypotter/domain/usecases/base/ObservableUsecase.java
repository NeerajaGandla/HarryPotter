package com.neeraja.harrypotter.domain.usecases.base;


import io.reactivex.Observable;
import io.reactivex.Scheduler;

public abstract class ObservableUsecase<T, Input> {
    private Scheduler foregroundScheduler;
    private Scheduler backgroundScheduler;

    public ObservableUsecase(Scheduler foregroundScheduler, Scheduler backgroundScheduler) {
        this.foregroundScheduler = foregroundScheduler;
        this.backgroundScheduler = backgroundScheduler;
    }

    protected abstract Observable generateObservable(Input input);

    public Observable<T> buildUsecase(Input input) {
        return generateObservable(input)
                .subscribeOn(backgroundScheduler)
                .observeOn(foregroundScheduler);
    }
}
