package com.neeraja.harrypotter.ui.houses.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.neeraja.harrypotter.R
import com.neeraja.harrypotter.presentation.models.House
import kotlinx.android.synthetic.main.layout_house_list_item.view.*

class HousesAdapter(
        private val listener: HouseClickListener
) : RecyclerView.Adapter<HousesAdapter.HousesViewHolder>() {

    private val housesList: MutableList<House> = ArrayList()

    fun populate(houses: List<House>) {
        housesList.clear()
        housesList.addAll(houses)
        notifyDataSetChanged()
    }

    inner class HousesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(house: House) {
            itemView.textView.text = house.name

            itemView.setOnClickListener {
                listener.onHouseClick(house);
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HousesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HousesViewHolder(
                inflater.inflate(R.layout.layout_house_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int = housesList.size

    override fun onBindViewHolder(holder: HousesViewHolder, position: Int) =
            holder.bind(housesList[position])

    interface HouseClickListener {
        fun onHouseClick(house: House)
    }
}