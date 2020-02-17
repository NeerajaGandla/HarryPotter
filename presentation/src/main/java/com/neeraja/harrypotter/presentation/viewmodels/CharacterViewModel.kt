package com.neeraja.harrypotter.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.toLiveData
import com.neeraja.harrypotter.domain.entities.CharacterEntity
import com.neeraja.harrypotter.domain.usecases.GetCharacterByIdTask
import com.neeraja.harrypotter.presentation.mapper.Mapper
import com.neeraja.harrypotter.presentation.models.Character
import com.neeraja.harrypotter.presentation.models.Resource
import com.neeraja.harrypotter.presentation.qualifiers.UserIdentity
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject

class CharacterViewModel @Inject constructor(
        @UserIdentity private val userIdentifier: String,
        private val mapper: Mapper<CharacterEntity, Character>,
        val getCharacterByIdTask: GetCharacterByIdTask
) : ViewModel() {
    //    @Inject
    val characterId: String = ""

    val characterByIdResource: LiveData<Resource<Character>>
        get() = getCharacterByIdTask
                .buildUsecase(GetCharacterByIdTask.Params(userIdentifier, characterId))
                .map { mapper.to(it) }
                .map { Resource.success(it) }
                .startWith(Resource.loading())
                .onErrorResumeNext(
                        Function {
                            Observable.just(Resource.error(it.localizedMessage))
                        }
                ).toFlowable(BackpressureStrategy.LATEST)
                .toLiveData()
}