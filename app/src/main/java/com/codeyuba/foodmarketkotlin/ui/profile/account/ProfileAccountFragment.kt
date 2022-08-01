package com.codeyuba.foodmarketkotlin.ui.profile.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.model.dummy.ProfileMenuModel
import com.codeyuba.foodmarketkotlin.ui.profile.ProfileAdapter
import kotlinx.android.synthetic.main.fragment_profile_account.*
import java.lang.reflect.Array

class ProfileAccountFragment : Fragment(), ProfileAdapter.ItemAdapterCallback {

    private var menuArrayList: ArrayList<ProfileMenuModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initDataDummy()
        var adapter = ProfileAdapter(menuArrayList,this)
        var layoutManager :RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter
    }

    fun initDataDummy() {
        menuArrayList = ArrayList()
        menuArrayList.add(ProfileMenuModel("Edit Profile"))
        menuArrayList.add(ProfileMenuModel("Home Address"))
        menuArrayList.add(ProfileMenuModel("Security"))
        menuArrayList.add(ProfileMenuModel("Payment"))

    }

    override fun onClick(view: View, data: ProfileMenuModel) {
        TODO("Not yet implemented")
    }
}