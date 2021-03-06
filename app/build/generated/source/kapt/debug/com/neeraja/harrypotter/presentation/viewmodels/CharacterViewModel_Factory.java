// Generated by Dagger (https://dagger.dev).
package com.neeraja.harrypotter.presentation.viewmodels;

import com.neeraja.harrypotter.domain.entities.CharacterEntity;
import com.neeraja.harrypotter.domain.usecases.GetCharacterByIdTask;
import com.neeraja.harrypotter.presentation.mapper.Mapper;
import com.neeraja.harrypotter.presentation.models.Character;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CharacterViewModel_Factory implements Factory<CharacterViewModel> {
  private final Provider<String> userIdentifierProvider;

  private final Provider<Mapper<CharacterEntity, Character>> mapperProvider;

  private final Provider<GetCharacterByIdTask> getCharacterByIdTaskProvider;

  public CharacterViewModel_Factory(Provider<String> userIdentifierProvider,
      Provider<Mapper<CharacterEntity, Character>> mapperProvider,
      Provider<GetCharacterByIdTask> getCharacterByIdTaskProvider) {
    this.userIdentifierProvider = userIdentifierProvider;
    this.mapperProvider = mapperProvider;
    this.getCharacterByIdTaskProvider = getCharacterByIdTaskProvider;
  }

  @Override
  public CharacterViewModel get() {
    return newInstance(userIdentifierProvider.get(), mapperProvider.get(), getCharacterByIdTaskProvider.get());
  }

  public static CharacterViewModel_Factory create(Provider<String> userIdentifierProvider,
      Provider<Mapper<CharacterEntity, Character>> mapperProvider,
      Provider<GetCharacterByIdTask> getCharacterByIdTaskProvider) {
    return new CharacterViewModel_Factory(userIdentifierProvider, mapperProvider, getCharacterByIdTaskProvider);
  }

  public static CharacterViewModel newInstance(String userIdentifier,
      Mapper<CharacterEntity, Character> mapper, GetCharacterByIdTask getCharacterByIdTask) {
    return new CharacterViewModel(userIdentifier, mapper, getCharacterByIdTask);
  }
}
