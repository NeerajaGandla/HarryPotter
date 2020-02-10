package com.neeraja.harrypotter.ui.houses.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.neeraja.harrypotter.R
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.models.Status
import com.neeraja.harrypotter.presentation.viewmodels.HouseDetailViewModel
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.activity_houses.*
import kotlinx.android.synthetic.main.fragment_house_details.*
import javax.inject.Inject

class HouseDetailFragment : DaggerFragment() {

    private var sharedViewModel: HousesViewModel? = null

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var houseId: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_house_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sharedViewModel = activity?.let { ViewModelProviders.of(it, viewModelFactory).get(HousesViewModel::class.java) }
        houseId = sharedViewModel?.houseId?.value.toString()
        sharedViewModel?.houseByIdResource?.observe(this, Observer { it ->
            when (it.status) {
                Status.LOADING -> {
                    println("Houses Loading")
                    showLoader()
                }
                Status.ERROR -> {
                    println("Houses ERROR: ${it.message}")
                    hideLoader()
                }
                Status.SUCCESS -> {
                    hideLoader()
                    it.data?.let { house ->
                        setData(house)
                    }
                }

            }
        })
    }

    private fun setData(house: House) {
        mascotTv.text = house.mascot
        houseNameTv.text = house.name
        schoolNameTv.text = house.school
        headofHouseTv.text = house.headOfHouse
        houseGhostTv.text = house.houseGhost
        founderTv.text = house.founder
        viewMembersButton.setOnClickListener {
            //TO-DO
        }
    }

    private fun showLoader() {
        pbHouseLoader.visibility = View.VISIBLE
    }

    private fun hideLoader() {
        pbHouseLoader.visibility = View.GONE
    }
}