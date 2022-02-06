package com.example.navcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class ThirdFragment : Fragment(R.layout.fragment_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.to1button)?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragment()
            Navigation.findNavController(view).navigate(action)
        }

        view.findViewById<Button>(R.id.to2button)?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToSecondFragment()
            Navigation.findNavController(view).navigate(action)
        }
    }
}
