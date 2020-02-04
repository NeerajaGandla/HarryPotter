package com.neeraja.harrypotter.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.toLiveData
import com.neeraja.harrypotter.domain.entities.HouseEntity
import com.neeraja.harrypotter.domain.usecases.GetHouseByIdTask
import com.neeraja.harrypotter.presentation.mapper.Mapper
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.models.Resource
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.functions.Function
import javax.inject.Inject

class HouseDetailViewModel @Inject constructor(
        private val houseId : String,
        private val mapper : Mapper<HouseEntity, House>,
        private val getHouseByIdTask: GetHouseByIdTask
) : ViewModel() {
    val houseByIdResource : LiveData<Resource<House>>
        get() = getHouseByIdTask
                .buildUsecase(houseId)
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