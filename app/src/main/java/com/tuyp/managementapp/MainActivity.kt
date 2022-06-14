package com.tuyp.managementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.tuyp.managementapp.data.model.MenuSource
import com.tuyp.managementapp.databinding.ActivityMainBinding
import com.tuyp.managementapp.view.adapter.MenuAdapter

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding
    var menuSource = ArrayList<MenuSource>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        menuSource.add(MenuSource(1,"Money Management","money_iconx3"))
        menuSource.add(MenuSource(2,"To Do List","note_icon"))
        menuSource.add(MenuSource(3,"Sleep Tracking ","sleep_icon"))
//        viewBinding.apply {
//            recMenu.layoutManager = GridLayoutManager(this@MainActivity,2)
//            var adapter = MenuAdapter()
//            adapter.setData(menuSource)
//            recMenu.adapter = adapter
//            adapter.notifyDataSetChanged()
//        }

    }
}