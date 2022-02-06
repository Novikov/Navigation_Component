package com.example.navcomponent

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var controller: NavController

    @SuppressLint("RestrictedApi")
    private val listener =
        NavController.OnDestinationChangedListener { controller, destination, arguments ->
            val backStack =
                controller.backStack.toList()
                    .map { it.destination.displayName.substringAfter("id/") }
            Log.i("bsView", "$backStack")
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        controller = navHostFragment.navController
    }

    override fun onResume() {
        super.onResume()
        controller.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        controller.removeOnDestinationChangedListener(listener)
        super.onPause()
    }
}
