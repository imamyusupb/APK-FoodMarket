package com.codeyuba.foodmarketkotlin.ui.home.newtaste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.model.dummy.HomeVerticalModel
import com.codeyuba.foodmarketkotlin.utils.Helpers.formatPrice
import kotlinx.android.synthetic.main.item_home_vertical.view.*

class HomeNewTasteAdapter(
    private val listData: List<HomeVerticalModel>,
    private val itemAdapterCallback: ItemAdapterCallback
) : RecyclerView.Adapter<HomeNewTasteAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeNewTasteAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeNewTasteAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }


    override fun getItemCount(): Int = listData.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: HomeVerticalModel, itemAdapterCallback: ItemAdapterCallback) {

            itemView.apply {
                tvName.text = data.title
                tvPrice.formatPrice(data.price)
                rbFood.rating = data.rating

//                Glide.with(context)
//                    .load(data.picturePath)
//                    .into(ivPoster)
//

                itemView.setOnClickListener {
                    itemAdapterCallback.onClick(
                        it, data
                    )
                }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(view: View, data: HomeVerticalModel)
    }
}