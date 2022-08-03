package com.codeyuba.foodmarketkotlin.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.codeyuba.foodmarketkotlin.R
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as DetailActivity).toolbarPayment()

        btnCheckOut.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_paymentFragment_to_paymentSuccessFragment)
        }
    }
}