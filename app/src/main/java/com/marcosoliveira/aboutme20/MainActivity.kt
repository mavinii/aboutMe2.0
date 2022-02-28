package com.marcosoliveira.aboutme20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*


// **IMPORTANT** this class "MainActivity" I just use as a main point!
// This class is responsible for all of the other classes
// On this videos, he explains it better: https://www.youtube.com/watch?v=Chso6xrJ6aU
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // These cods represents all screens with (bottom_nav_icons) and (top_title) are linked together
        // Source: https://www.youtube.com/watch?v=Chso6xrJ6aU
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)

        // All screen should be linked here
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment, R.id.fourthFragment, R.id.fifthFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)

        // This function enables for me to make my button clickable
        // https://material.io/components/snackbars/android#theming-snackbars
        val contextView = findViewById<View>(R.id.floating_action_button)
        floating_action_button.setOnClickListener {
            Snackbar.make(this, contextView, "22931@student.dorset-college.ie", Snackbar.LENGTH_LONG)
                .show()
        }
    }
}