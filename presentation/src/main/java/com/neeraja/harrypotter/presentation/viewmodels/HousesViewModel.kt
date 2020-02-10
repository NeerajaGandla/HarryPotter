package com.neeraja.harrypotter.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.toLiveData
import com.neeraja.harrypotter.domain.entities.HouseEntity
import com.neeraja.harrypotter.domain.usecases.GetAllHousesTask
import com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask
import com.neeraja.harrypotter.domain.utils.Constants
import com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper
import com.neeraja.harrypotter.presentation.mapper.Mapper
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.models.Resource
import com.neeraja.harrypotter.presentation.qualifiers.UserIdentity
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.functions.Function
import javax.inject.Inject

class HousesViewModel @Inject internal constructor(
        @UserIdentity private val userIdentifier: String,
        private val mapper: HouseEntityMapper,
        val getAllHousesTask: GetAllHousesTask,
        val getHouseByIdTask: GetHouseByIdTask
) : ViewModel() {
    val houseId = MutableLiveData<String>()
    val housesResource: LiveData<Resource<List<House>>>
        get() = getAllHousesTask
                .buildUsecase(userIdentifier)
                .map { houseEntities ->
                    houseEntities.map {
                        mapper.to(it)
                    }
                }
                .map { Resource.success(it) }
                .startWith(Resource.loading())
                .onErrorResumeNext(
                        Function {
                            Observable.just(Resource.error(it.localizedMessage))
                        }
                ).toFlowable(BackpressureStrategy.LATEST)
                .toLiveData()

    val houseByIdResource : LiveData<Resource<House>>
        get() = getHouseByIdTask
                .buildUsecase(GetHouseByIdTask.Params(userIdentifier, houseId.value))
                .map {  mapper.to(it) }
                .map { Resource.success(it) }
                .startWith(Resource.loading())
                .onErrorResumeNext(
                        Function {
                            Observable.just(Resource.error(it.localizedMessage))
                        }
                ).toFlowable(BackpressureStrategy.LATEST)
                .toLiveData()

}