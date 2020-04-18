package com.example.gozarra.coderswag.Services

import com.example.gozarra.coderswag.Model.Category
import com.example.gozarra.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Graphic Benie", "200", "hat1"),
            Product("Hat Black", "300", "hat2"),
            Product("Hat White", "250", "hat3"),
            Product("Hat Snapback", "500", "hat4")
    )

    val hoodies = listOf(
            Product("Hoodie Gray", "200", "hoodie1"),
            Product("Hoodie Red", "200", "hoodie2"),
            Product("Hoodie Black", "200", "hoodie3"),
            Product("Hoodie White", "200", "hoodie4")
    )

    val shirts = listOf(
            Product("Shirt black", "200", "shirt1"),
            Product("Badge light gray", "300", "shirt2"),
            Product("Logo shirt red", "400", "shirt3"),
            Product("Hustle", "500", "shirt4"),
            Product("Kickflip Studios", "700", "shirt5")
    )
}