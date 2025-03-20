package com.example.fregment_20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val loginBtn = view.findViewById<Button>(R.id.login_btn)
        val regBtn = view.findViewById<Button>(R.id.reg_btn)

        loginBtn.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment2_to_profileFragment2)
        }

        regBtn.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment2_to_regFragment2)
        }

        return view
    }
}
