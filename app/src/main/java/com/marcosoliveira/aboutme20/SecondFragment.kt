package com.marcosoliveira.aboutme20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

                               // TODO: This is the variable to call the screen
class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)

    // Now im going to start to work on the second fragment, ive been
    // think about to use cards
    }
}