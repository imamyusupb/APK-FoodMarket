package com.codeyuba.foodmarketkotlin.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.model.dummy.HomeModel
import kotlinx.android.synthetic.main.fragment_home.view.tvName
import kotlinx.android.synthetic.main.item_home_horizontal.view.*

class HomeAdapter(
    private val listData: List<HomeModel>,
    private val itemAdapterCallback: ItemAdapterCallback
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }


    override fun getItemCount(): Int = listData.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: HomeModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvName.text = data.title
                rbFood.rating = data.rating

//                Glide.with(context)
//                    .load(data.src)
//                    .into(ivPoster)

                itemView.setOnClickListener {
                    itemAdapterCallback.onClick(
                        it, data
                    )
                }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(view: View, data: HomeModel)
    }
}