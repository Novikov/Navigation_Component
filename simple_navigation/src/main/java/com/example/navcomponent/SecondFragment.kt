package com.example.navcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.to3button)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            Navigation.findNavController(view).navigate(action)
        }

        // ничего не произойдет
        view.findViewById<Button>(R.id.to3button_pop_up_to_3)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragmentPopUpTo3()
            Navigation.findNavController(view).navigate(action)
        }

        // ничего не произойдет
        view.findViewById<Button>(R.id.to3button_pop_up_to_3_inclusive)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragmentPopUpTo3Inclusive()
            Navigation.findNavController(view).navigate(action)
        }

        // ничего не произойдет
        view.findViewById<Button>(R.id.to3button_pop_up_to_2)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragmentPopUpTo2()
            Navigation.findNavController(view).navigate(action)
        }

        // удалится 2 фрагмент
        view.findViewById<Button>(R.id.to3button_pop_up_to_2_inclusive)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragmentPopUpTo2Inclusive()
            Navigation.findNavController(view).navigate(action)
        }

        // удалится 2 фрагмент
        view.findViewById<Button>(R.id.to3button_pop_up_to_1)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragmentPopUpTo1()
            Navigation.findNavController(view).navigate(action)
        }

        // удалится 1 и 2 фрагмент
        view.findViewById<Button>(R.id.to3button_pop_up_to_1_inclusive)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragmentPopUpTo1Inclusive()
            Navigation.findNavController(view).navigate(action)
        }

        view.findViewById<Button>(R.id.to1button)?.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(view).navigate(action)
        }
    }
}
