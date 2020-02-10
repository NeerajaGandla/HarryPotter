package com.neeraja.harrypotter.ui.houses.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.neeraja.harrypotter.utils.ALPHA_HIDDEN
import com.neeraja.harrypotter.utils.ALPHA_VISIBLE
import com.neeraja.harrypotter.R
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.models.Status
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel
import com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.activity_houses.*
import kotlinx.android.synthetic.main.fragment_houses.*
import javax.inject.Inject

class HousesFragment : DaggerFragment(),
        HousesAdapter.HouseClickListener {
    private var sharedViewModel: HousesViewModel? = null

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val housesAdapter = HousesAdapter(this)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_houses, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        sharedViewModel = activity?.let { ViewModelProviders.of(it, viewModelFactory).get(HousesViewModel::class.java) }

        housesRecyclerView.layoutManager = LinearLayoutManager(activity)
        housesRecyclerView.adapter = housesAdapter

        sharedViewModel?.housesResource?.observe(this, Observer {
            when (it.status) {
                Status.LOADING -> {
                    println("Houses Loading....")
                    showLoader()
                }
                Status.ERROR -> {
                    println("Error in Loading Houses : " + it.message)
                    hideLoader()
                }
                Status.SUCCESS -> {
                    hideLoader()
                    it.data?.let { houses ->
                        housesAdapter.populate(houses)
                    }
                }
            }
        })
    }

    private fun showLoader() {
        pbHouseLoader.visibility = View.VISIBLE
        housesRecyclerView.alpha = ALPHA_HIDDEN
    }

    private fun hideLoader() {
        pbHouseLoader.visibility = View.GONE
        housesRecyclerView.alpha = ALPHA_VISIBLE
    }

    override fun onHouseClick(house: House) {
        sharedViewModel?.houseId?.value = house.id

    }
}