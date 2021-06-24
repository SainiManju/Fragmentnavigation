package com.example.task_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_two.*


class TwoFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      arguments?.let{

      }
  }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var threefragment = ThreeFragment()
        var twofragment = TwoFragment()
        fragment2_Btn_next.setOnClickListener() {
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container_frameLayout, threefragment, "Two")?.addToBackStack("Two")?.commit()
        }
        Fragment2_Btn_last.setOnClickListener() {
           // fragmentManager?.beginTransaction()?.addToBackStack("One")?.commit()
            fragmentManager?.popBackStack()
        }
        (requireActivity() as MainActivity).func1("Fragment Two")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }










//    private fun changeFragment(fragment: Fragment) {
//        val trans = activity?.supportFragmentManager?.beginTransaction()
//            ?.replace(R.id.root,fragment)
//            ?.addToBackStack(null)
//            ?.commit()
//    }
}