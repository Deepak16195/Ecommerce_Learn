package com.example.ecommerce_learn.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ecommerce_learn.Model.CategoryModel
import com.example.ecommerce_learn.Model.HotDealsModel
import com.example.ecommerce_learn.R
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.category_custom.view.*
import kotlinx.android.synthetic.main.hotdeal_custom.view.*

class HotDealsAdapter(var context: Context,internal var lists:ArrayList<HotDealsModel>): RecyclerView.Adapter<HotDealsAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(model: HotDealsModel) {
            itemView.hotdeal_name.text = model.name
            itemView.hotdeal_category_name.text  = model.type
            itemView.hotdeal_price.text = model.price
            Glide.with(context)
                    .load(model.image)
                    .fitCenter()
                    .into(itemView.hotdeal_image)
            itemView.hotdeal_discounts.text  = model.discount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.hotdeal_custom,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: HotDealsAdapter.MyViewHolder, position: Int) {
        var model  = lists[position]
        holder.setData(model)
    }
}