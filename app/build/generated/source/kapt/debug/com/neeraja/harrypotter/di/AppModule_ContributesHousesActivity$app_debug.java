package com.neeraja.harrypotter.di;

import com.neeraja.harrypotter.ui.houses.HousesActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = AppModule_ContributesHousesActivity$app_debug.HousesActivitySubcomponent.class
)
public abstract class AppModule_ContributesHousesActivity$app_debug {
  private AppModule_ContributesHousesActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(HousesActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HousesActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface HousesActivitySubcomponent extends AndroidInjector<HousesActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HousesActivity> {}
  }
}
