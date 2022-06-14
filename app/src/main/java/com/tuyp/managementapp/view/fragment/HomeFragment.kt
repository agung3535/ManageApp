package com.tuyp.managementapp.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tuyp.managementapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var viewBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return viewBinding.root
    }


}