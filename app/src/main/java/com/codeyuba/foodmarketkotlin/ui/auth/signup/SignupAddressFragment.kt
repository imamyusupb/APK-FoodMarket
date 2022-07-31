package com.codeyuba.foodmarketkotlin.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signup_address.*
import kotlinx.android.synthetic.main.layout_toolbar.*


class SignupAddressFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_address, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_signupNow.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signupAddressFragment_to_signupSuccessFragment,null)
            (activity as AuthActivity).toolbarSignupSuccess()
        }
    }
}

