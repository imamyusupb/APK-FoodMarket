package com.codeyuba.foodmarketkotlin.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codeyuba.foodmarketkotlin.R
import com.codeyuba.foodmarketkotlin.databinding.FragmentSigninBinding
import com.codeyuba.foodmarketkotlin.ui.MainActivity
import com.codeyuba.foodmarketkotlin.ui.auth.AuthActivity

class SigninFragment : Fragment() {

    private var _binding: FragmentSigninBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignup.setOnClickListener {
            val signup = Intent(requireActivity(), AuthActivity::class.java)
            signup.putExtra("page_request", 2)
            startActivity(signup)
        }

        binding.btnSignin.setOnClickListener {
            val home = Intent(activity,MainActivity::class.java)
            startActivity(home)
            activity?.finish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}