package com.example.coffeeapp.data

import com.example.coffeeapp.R
import com.example.coffeeapp.model.Cart
import com.example.coffeeapp.model.Coffee

class Datasource {
    //return list of data
    fun loadData( ):List<Coffee>{
        return listOf(
            Coffee(R.string.Americano,R.string.Americano_d,R.drawable.americano) ,
            Coffee(R.string.Cappuccino,R.string.Cappuccino_d,R.drawable.cappuccino) ,
            Coffee(R.string.Espresso,R.string.Espresso_d,R.drawable.espresso) ,
            Coffee(R.string.FlatWhite,R.string.FlatWhite_d,R.drawable.flatwhite) ,
            Coffee(R.string.Macchiato,R.string.Macchiato_d,R.drawable.macchiato) ,
            Coffee(R.string.Mocha,R.string.Mocha_d,R.drawable.mocha),
            Coffee(R.string.Latte, R.string.Latte_d,R.drawable.latte)

        )
    }
    fun loadDataCart():List<Cart>{
        return listOf(
            Cart(R.string.Americano,R.drawable.americano) ,
            Cart(R.string.Cappuccino,R.drawable.cappuccino) ,
            Cart(R.string.Espresso,R.drawable.espresso) ,
            Cart(R.string.FlatWhite,R.drawable.flatwhite) ,
            Cart(R.string.Macchiato,R.drawable.macchiato) ,
            Cart(R.string.Mocha,R.drawable.mocha))
    }
}