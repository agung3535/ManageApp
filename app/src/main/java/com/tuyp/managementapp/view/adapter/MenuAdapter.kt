package com.tuyp.managementapp.view.adapter

import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tuyp.managementapp.data.model.MenuSource
import com.tuyp.managementapp.databinding.MenuItemLayoutBinding


class MenuAdapter: RecyclerView.Adapter<MenuAdapter.MenuHomeViewHolder>() {

    var menuSource = ArrayList<MenuSource>()

    fun setData(menuSource: List<MenuSource>) {
        if (menuSource == null) return
        this.menuSource.clear()
        this.menuSource.addAll(menuSource)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHomeViewHolder {
        return MenuHomeViewHolder(MenuItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MenuHomeViewHolder, position: Int) {
        holder.bindData(menuSource[position])
    }

    override fun getItemCount(): Int = menuSource.size

    inner class MenuHomeViewHolder(val binding: MenuItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: MenuSource) {
            binding.apply {
                var uri = "@drawable/${data.icon}"

                Log.e("dataaa","res = $uri")
                var imageResource: Int = itemView.getResources().getIdentifier(uri, null, itemView.context.packageName)
                titleMenu.text = data.title
                val res: Drawable = itemView.getResources().getDrawable(imageResource)
                menuIcon.setImageDrawable(res)
            }
        }
    }
}