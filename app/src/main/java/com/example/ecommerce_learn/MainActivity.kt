package com.example.ecommerce_learn

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce_learn.Adapter.CategoryAdapter
import com.example.ecommerce_learn.Adapter.HotDealsAdapter
import com.example.ecommerce_learn.Adapter.SliderAdapters
import com.example.ecommerce_learn.Model.CategoryModel
import com.example.ecommerce_learn.Model.HotDealsModel
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.RED))
        supportActionBar!!.title = "Ecommerce Example"
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        sliderImage()
        topCategory()
        hotDeals()

    }


    //slider image
    fun sliderImage(){
        var sliderAdapter = SliderAdapters(this)
        imageSlider.sliderAdapter = sliderAdapter
        imageSlider.setIndicatorAnimation(IndicatorAnimations.WORM)//set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        imageSlider.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        imageSlider.indicatorSelectedColor = Color.WHITE
        imageSlider.indicatorUnselectedColor = Color.GRAY
        imageSlider.scrollTimeInSec = 4
        imageSlider.startAutoCycle()
    }

    //top category
    fun topCategory(){
        var linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvTopCategory.layoutManager = linearLayoutManager

        var lists = ArrayList<CategoryModel>()
        lists.add(CategoryModel("Men",R.drawable.category_shirt))
        lists.add(CategoryModel("Women",R.drawable.category_woment))
        lists.add(CategoryModel("Boy",R.drawable.category_boy))
        lists.add(CategoryModel("Girls",R.drawable.category_girl))
        lists.add(CategoryModel("Baby & Mother",R.drawable.category_babyclothes))
        lists.add(CategoryModel("HouseHold",R.drawable.category_household))
        lists.add(CategoryModel("Men",R.drawable.category_shirt))

        var adapters = CategoryAdapter(this,lists)
        rvTopCategory.adapter = adapters
    }

    //hot deals
    fun hotDeals(){
        var linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvHotDeals.layoutManager = linearLayoutManager

        var lists = ArrayList<HotDealsModel>()
        lists.add(HotDealsModel("Red Black Libstick","Baby & Mother","$90","50%",R.drawable.hotdeals_chair))
        lists.add(HotDealsModel("Red Black Libstick","Baby & Mother","$90","50%",R.drawable.hotdeals_chair))
        lists.add(HotDealsModel("Red Black Libstick","Baby & Mother","$90","50%",R.drawable.hotdeals_chair))
        lists.add(HotDealsModel("Red Black Libstick","Baby & Mother","$90","50%",R.drawable.hotdeals_chair))
        lists.add(HotDealsModel("Red Black Libstick","Baby & Mother","$90","50%",R.drawable.hotdeals_chair))
        lists.add(HotDealsModel("Red Black Libstick","Baby & Mother","$90","50%",R.drawable.hotdeals_chair))


        var adapters = HotDealsAdapter(this,lists)
        rvHotDeals.adapter = adapters
    }


}