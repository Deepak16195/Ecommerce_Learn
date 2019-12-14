package com.example.ecommerce_learn.Model

class HotDealsModel {
    var name:String = ""
    var type:String = ""
    var price:String = ""
    var discount:String = ""
    var image:Int = 0

    constructor(name: String, type: String, price: String, discount: String, image: Int) {
        this.name = name
        this.type = type
        this.price = price
        this.discount = discount
        this.image = image
    }
}