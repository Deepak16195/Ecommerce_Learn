package com.example.ecommerce_learn.Model

class TrendingModel{
    var price:String = ""
    var name:String = ""
    var type:String = ""
    var rate:String = ""
    var description:String = ""
    var image:String = ""

    constructor(price: String, name: String, type: String, rate: String, description: String, image: String) {
        this.price = price
        this.name = name
        this.type = type
        this.rate = rate
        this.description = description
        this.image = image
    }
}