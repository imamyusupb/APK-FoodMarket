package com.codeyuba.foodmarketkotlin.ui.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.codeyuba.foodmarketkotlin.R
import kotlinx.android.synthetic.main.layout_toolbar.*

class DetailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }


    fun toolbarPayment(){
        toolbar.title = "Payment"
        toolbar?.visibility = View.VISIBLE
        toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun toolbarDetail(){
        toolbar?.visibility = View.GONE

    }

}