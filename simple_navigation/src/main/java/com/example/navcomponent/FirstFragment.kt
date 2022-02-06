package com.example.navcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.to2button)?.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            Navigation.findNavController(view).navigate(action)
        }

        view.findViewById<Button>(R.id.to3Button)?.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToThirdFragment()
            Navigation.findNavController(view).navigate(action)
        }
    }
}
