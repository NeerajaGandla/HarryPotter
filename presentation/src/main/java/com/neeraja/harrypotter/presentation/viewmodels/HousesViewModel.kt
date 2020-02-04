package com.neeraja.harrypotter.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.toLiveData
import com.neeraja.harrypotter.domain.entities.HouseEntity
import com.neeraja.harrypotter.domain.usecases.GetAllHousesTask
import com.neeraja.harrypotter.domain.utils.Constants
import com.neeraja.harrypotter.presentation.mapper.HouseEntityMapper
import com.neeraja.harrypotter.presentation.mapper.Mapper
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.models.Resource
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject

class HousesViewModel @Inject constructor(
        private val mapper: HouseEntityMapper,
        private val getAllHousesTask: GetAllHousesTask
) : ViewModel() {
    val housesResource: LiveData<Resource<List<House>>>
        get() = getAllHousesTask
                .buildUsecase(Constants.API_KEY)
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
}