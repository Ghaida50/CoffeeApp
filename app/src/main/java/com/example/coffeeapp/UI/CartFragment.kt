package com.example.coffeeapp.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.coffeeapp.R


class CartFragment : androidx.fragment.app.Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        arguments?.let {
            CoffeeDetailsFragment.coffeeName = it.getString(CoffeeDetailsFragment.name).toString()
            CoffeeDetailsFragment.imagepath = it.getInt(CoffeeDetailsFragment.image)
            CoffeeDetailsFragment.count = it.getInt(CoffeeDetailsFragment.count1)
        }
        var coffee_name: TextView = itemView.findViewById(R.id.name)
        var coffee_count: TextView = itemView.findViewById(R.id.details)
        var coffee_image: ImageView = itemView.findViewById(R.id.img)


        coffee_name.text = CoffeeDetailsFragment.coffeeName
        coffee_image.setImageResource(CoffeeDetailsFragment.imagepath)
        coffee_count.text = CoffeeDetailsFragment.count.toString()
    }
}