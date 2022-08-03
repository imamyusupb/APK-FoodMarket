package com.codeyuba.foodmarketkotlin.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.databinding.FragmentHomeBinding
import com.codeyuba.foodmarketkotlin.model.dummy.HomeModel
import com.codeyuba.foodmarketkotlin.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback {

    private var foodList :ArrayList<HomeModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home,container,false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initDataDummy()
        var adapter = HomeAdapter(foodList,this)
        var layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        rcList.adapter = adapter
        rcList.layoutManager = layoutManager
        rcList.setHasFixedSize(true)

        val sectionPagerAdapter = SectionPagerAdapter(
            childFragmentManager
        )
        viewPager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

    fun initDataDummy(){
        foodList = ArrayList()
        foodList.add(HomeModel("Chery Apel Cuka","",5F))
        foodList.add(HomeModel("Nasi Goreng Kambing","",4F))
        foodList.add(HomeModel("Nasi Kapau Minang","",3F))
        foodList.add(HomeModel("Bandeng Goreng","",4.5F))
    }

    override fun onClick(view: View, data: HomeModel) {
        val intent = Intent(activity, DetailActivity::class.java)
        startActivity(intent)
    }
}