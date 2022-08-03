package com.codeyuba.foodmarketkotlin.ui.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.model.dummy.ProfileMenuModel
import kotlinx.android.synthetic.main.item_profile.view.*

class ProfileAdapter(
    private val listData: List<ProfileMenuModel>,
    private val itemAdapterCallback: ItemAdapterCallback
) : RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_profile, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }


    override fun getItemCount(): Int = listData.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: ProfileMenuModel, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvName.text = data.title

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
        fun onClick(view: View, data: ProfileMenuModel)
    }
}