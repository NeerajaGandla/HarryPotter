package com.neeraja.harrypotter.di;

import com.neeraja.harrypotter.ui.houses.fragments.HousesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AppModule_ContributeMainFragment.HousesFragmentSubcomponent.class)
public abstract class AppModule_ContributeMainFragment {
  private AppModule_ContributeMainFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HousesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HousesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HousesFragmentSubcomponent extends AndroidInjector<HousesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HousesFragment> {}
  }
}
