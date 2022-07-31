package com.codeyuba.foodmarketkotlin.ui.home.recomended

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.model.dummy.HomeVerticalModel
import com.codeyuba.foodmarketkotlin.ui.home.newtaste.HomeNewTasteAdapter
import kotlinx.android.synthetic.main.fragment_home_new_taste.*

class HomeRecomendedFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallback {
    private var foodList :ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initDataDummy()
        var adapter = HomeNewTasteAdapter(foodList,this)
        var layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL,false)

        rcList.adapter = adapter
        rcList.layoutManager = layoutManager
        rcList.setHasFixedSize(true)


    }

    fun initDataDummy(){
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Nasi Lemang minang sahajo","24000","",5F))
        foodList.add(HomeVerticalModel("Nasi Ayam Geprek Bintnag","14000","",4F))
        foodList.add(HomeVerticalModel("Bubur Barito Amis Telur","18000","",3F))
        foodList.add(HomeVerticalModel("Semur Jengkol","32000","",5F))
        foodList.add(HomeVerticalModel("Soto Kudus Kental","20000","",5F))

    }

    override fun onClick(view: View, data: HomeVerticalModel) {
        TODO("Not yet implemented")
    }
}