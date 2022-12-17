package com.example.coffeeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeapp.R
import com.example.coffeeapp.UI.CoffeeDrinksFragmentDirections
import com.example.coffeeapp.model.Coffee

class CoffeeAdapter(private val context: Context, private val dataset: List<Coffee>) :
    RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

class CoffeeViewHolder(val view: View): RecyclerView.ViewHolder(view){
    val name: TextView = view.findViewById(R.id.name)
    val imageView: ImageView = view.findViewById(R.id.img)
    val card: CardView = view.findViewById(R.id.card)
    val textdescrption: TextView =view.findViewById(R.id.details)
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return CoffeeViewHolder(layout)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        val item = dataset[position]

        holder.name.text = context.resources.getString(item.name)
        holder.textdescrption.text = context.resources.getString(item.description)
        holder.imageView.setImageResource(item.img)
        holder.card.setOnClickListener {

            val action = CoffeeDrinksFragmentDirections.actionCoffeeDrinksFragmentToCoffeeDetailsFragment(holder.name.text.toString(),  holder.textdescrption.text.toString(),item.img)
            holder.view.findNavController().navigate(action)
        }
    }

    override fun getItemCount()= dataset.size



}
