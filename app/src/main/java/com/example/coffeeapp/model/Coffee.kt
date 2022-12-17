package com.example.coffeeapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Coffee(@StringRes val name:Int, @StringRes val description : Int ,  @DrawableRes val img :Int)
