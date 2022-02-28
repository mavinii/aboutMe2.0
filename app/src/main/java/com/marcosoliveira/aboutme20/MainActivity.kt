package com.marcosoliveira.aboutme20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // These cods represents all screens with bottom_nav_icons and top_title linked together
        // Source: https://www.youtube.com/watch?v=Chso6xrJ6aU
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)
        // All screen should be linked here
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment, R.id.fourthFragment, R.id.fifthFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)
    }
}