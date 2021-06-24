package com.example.task_fragments

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            var onefragment = OneFragment()
            var transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.fragment_container_frameLayout, onefragment)
        }

        }

        fun func1(abc: String) {
            activity_main_textView.setText(abc)
        }
    }


