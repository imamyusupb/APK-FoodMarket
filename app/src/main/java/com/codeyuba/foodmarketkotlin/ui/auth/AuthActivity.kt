package com.codeyuba.foodmarketkotlin.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.databinding.ActivityAuthBinding
import kotlinx.android.synthetic.main.layout_toolbar.*

class AuthActivity : AppCompatActivity() {
    private lateinit var binding :ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pageRequest = intent.getIntExtra("page_request",0)
        if (pageRequest == 2){
            toolbarSignup()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.signinFragment,true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signinFragment_to_signupFragment,null,navOptions)
        }

    }


    fun toolbarSignup(){
        toolbar.title = "Sign Up"
        toolbar.subtitle= "Register and eat"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun toolbarSignupAddress(){
        toolbar.title = "Address"
        toolbar.subtitle= "Make sure it's valid "
        toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun toolbarSignupSuccess(){
       toolbar.visibility = View.GONE
    }
}