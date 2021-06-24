package com.example.task_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_three.*
import kotlinx.android.synthetic.main.fragment_two.*

class ThreeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var threefragment = ThreeFragment()

        fragment3_Btn_last.setOnClickListener() {
           // fragmentManager?.beginTransaction()?.addToBackStack("Two")?.commit()
            fragmentManager?.popBackStack()
        }

        (requireActivity() as MainActivity).func1("Fragment Three")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
}

