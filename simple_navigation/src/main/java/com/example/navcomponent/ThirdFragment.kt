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

        // pop up to - выгрузить стек до фрагмента
        view.findViewById<Button>(R.id.to_1_button_pop_up_to_1)?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragmentPopUpToFirstFragment()
            Navigation.findNavController(view).navigate(action)
        }

        // pop up to inclusive = true - выгрузить стек до фрагмента, включая сам фрагмент
        view.findViewById<Button>(R.id.to_1_button_pop_up_to_1_inclusive)?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragmentPopUpToFirstFragmentPopUpToInclusive()
            Navigation.findNavController(view).navigate(action)
        }

        // launch single top = true - фрагмент не добавится если уже есть в стеке
        view.findViewById<Button>(R.id.to_1_button_pop_up_to_1_single_top)?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFirstFragmentPopUpToFirstFragmentLaunchSingleTop()
            Navigation.findNavController(view).navigate(action)
        }
    }
}
