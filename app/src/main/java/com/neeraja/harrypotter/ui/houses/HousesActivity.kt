package com.neeraja.harrypotter.ui.houses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.neeraja.harrypotter.R
import com.neeraja.harrypotter.presentation.factory.ViewModelFactory
import com.neeraja.harrypotter.presentation.models.House
import com.neeraja.harrypotter.presentation.viewmodels.HousesViewModel
import com.neeraja.harrypotter.ui.houses.adapters.HousesAdapter
import com.neeraja.harrypotter.ui.houses.fragments.HouseDetailFragment
import com.neeraja.harrypotter.ui.houses.fragments.HousesFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class HousesActivity : AppCompatActivity(), HasAndroidInjector {
    lateinit var sharedViewModel: HousesViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_houses)

        supportFragmentManager.beginTransaction().add(R.id.frameLayout, HousesFragment()).commit()

        sharedViewModel = ViewModelProviders.of(this, viewModelFactory).get(HousesViewModel::class.java)

        subscribeObservers()
    }

    private fun subscribeObservers() {
        sharedViewModel.houseId.observe(this, Observer {
            it?.let {
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, HouseDetailFragment()).commit()
            }
        })
    }

    override fun androidInjector(): AndroidInjector<Any>? = dispatchingAndroidInjector

}
