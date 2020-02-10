// Generated by Dagger (https://dagger.dev).
package com.neeraja.harrypotter.domain.usecases;

import com.neeraja.harrypotter.domain.repository.HogwartsRepository;
import dagger.internal.Factory;
import io.reactivex.Scheduler;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetAllHousesTask_Factory implements Factory<GetAllHousesTask> {
  private final Provider<HogwartsRepository> hogwartsRepositoryProvider;

  private final Provider<Scheduler> foregroundSchedulerProvider;

  private final Provider<Scheduler> backgroundSchedulerProvider;

  public GetAllHousesTask_Factory(Provider<HogwartsRepository> hogwartsRepositoryProvider,
      Provider<Scheduler> foregroundSchedulerProvider,
      Provider<Scheduler> backgroundSchedulerProvider) {
    this.hogwartsRepositoryProvider = hogwartsRepositoryProvider;
    this.foregroundSchedulerProvider = foregroundSchedulerProvider;
    this.backgroundSchedulerProvider = backgroundSchedulerProvider;
  }

  @Override
  public GetAllHousesTask get() {
    return newInstance(hogwartsRepositoryProvider.get(), foregroundSchedulerProvider.get(), backgroundSchedulerProvider.get());
  }

  public static GetAllHousesTask_Factory create(
      Provider<HogwartsRepository> hogwartsRepositoryProvider,
      Provider<Scheduler> foregroundSchedulerProvider,
      Provider<Scheduler> backgroundSchedulerProvider) {
    return new GetAllHousesTask_Factory(hogwartsRepositoryProvider, foregroundSchedulerProvider, backgroundSchedulerProvider);
  }

  public static GetAllHousesTask newInstance(HogwartsRepository hogwartsRepository,
      Scheduler foregroundScheduler, Scheduler backgroundScheduler) {
    return new GetAllHousesTask(hogwartsRepository, foregroundScheduler, backgroundScheduler);
  }
}