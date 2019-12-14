package com.example.ecommerce_learn.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ecommerce_learn.Model.CategoryModel
import com.example.ecommerce_learn.R
import kotlinx.android.synthetic.main.category_custom.view.*

class CategoryAdapter(var context: Context,internal var lists:ArrayList<CategoryModel>): RecyclerView.Adapter<CategoryAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(model: CategoryModel) {
            itemView.category_name.text = model.name
            Glide.with(context)
                    .load(model.image)
                    .override(100,100)
                    .into(itemView.category_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.category_custom,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var model  = lists[position]
        holder.setData(model)
    }
}