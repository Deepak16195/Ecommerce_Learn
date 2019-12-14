package com.example.ecommerce_learn.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.ecommerce_learn.R
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlinx.android.synthetic.main.sliders_custom.view.*

   public class SliderAdapters(context: Context): SliderViewAdapter<SliderAdapters.MySliderAdapters>() {

    inner class MySliderAdapters(var itemView: View) : SliderViewAdapter.ViewHolder(itemView) {
        fun setData(position: Int) {
            when(position){
                0 -> Glide.with(itemView)
                        .load("https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto/gigs/104955301/original/f3fad190ece8232f95ddbd61cfdc2c6966f35aa4/create-highly-converting-ecommerce-website.png")
                        .fitCenter()
                        .into(itemView.slider_image)
                1 -> Glide.with(itemView)
                        .load("https://techglimpse.ph/wp-content/uploads/2017/06/lazada-philippines.jpg")
                        .fitCenter()
                        .into(itemView.slider_image)
                2 -> Glide.with(itemView)
                        .load("https://ecommerceiq.asia/wp-content/uploads/2018/10/BeautyTH-Lazada.png")
                        .fitCenter()
                        .into(itemView.slider_image)

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup?): MySliderAdapters {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.sliders_custom, null)
        return MySliderAdapters(view)

    }

    override fun getCount(): Int {
        return 3
    }

    override fun onBindViewHolder(viewHolder: MySliderAdapters?, position: Int) {
        viewHolder!!.setData(position)
    }


}