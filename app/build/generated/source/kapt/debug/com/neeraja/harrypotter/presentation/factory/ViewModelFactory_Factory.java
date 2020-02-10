// Generated by Dagger (https://dagger.dev).
package com.neeraja.harrypotter.presentation.factory;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> providersProvider;

  public ViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> providersProvider) {
    this.providersProvider = providersProvider;
  }

  @Override
  public ViewModelFactory get() {
    return newInstance(providersProvider.get());
  }

  public static ViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> providersProvider) {
    return new ViewModelFactory_Factory(providersProvider);
  }

  public static ViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> providers) {
    return new ViewModelFactory(providers);
  }
}
