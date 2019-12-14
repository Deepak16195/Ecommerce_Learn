package com.example.ecommerce_learn.Model

class BrandDealsModel {
    var name:String = ""
    var discount:String = ""
    var image:Int = 0

    constructor(name: String, discount: String, image: Int) {
        this.name = name
        this.discount = discount
        this.image = image
    }
}