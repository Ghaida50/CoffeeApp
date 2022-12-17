package com.example.coffeeapp.UI

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.coffeeapp.R


class CoffeeDetailsFragment : Fragment() {
    companion object {
        var name = "name"
        var coffeeName = "Name"
        var descrption = "desc"
        var coffeeDescrption = "Description"
        var image = "image"
        var imagepath = 0
        var count = 0
        var count1 = "count"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coffee_details, container, false)
    }


    @SuppressLint("ResourceType")
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        arguments?.let {
            coffeeName = it.getString(name).toString()
            coffeeDescrption = it.getString(descrption).toString()
            imagepath = it.getInt(image)

        }

        var coffee_name: TextView = itemView.findViewById(R.id.title)
        var coffee_Description: TextView = itemView.findViewById(R.id.detail)
        var coffee_image: ImageView = itemView.findViewById(R.id.coffeeimg)


        coffee_name.text = coffeeName
        coffee_Description.text = coffeeDescrption
        coffee_image.setImageResource(imagepath)

        var txtCount: TextView = itemView.findViewById(R.id.count)

        var btn1: Button = itemView.findViewById(R.id.plus)

        btn1.setOnClickListener {
            count++
            txtCount.text = count.toString()
        }

        var btn2: Button = itemView.findViewById(R.id.minus)
        btn2.setOnClickListener {
            count--
            txtCount.text = count.toString()
        }

         //var c = txtCount.getText().toString()
        // count= c.toInt()

        var btn3: ImageButton = itemView.findViewById(R.id.imageButton)
        btn3.setOnClickListener {
            val action = CoffeeDetailsFragmentDirections.actionCoffeeDetailsFragmentToCartFragment(
                coffeeName, count1, imagepath
            )
            itemView.findNavController().navigate(action)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.share_menu) {
            var shareIntent = Intent().apply {
                this.action = Intent.ACTION_SEND
                this.putExtra(Intent.EXTRA_TEXT, coffeeName)
                this.putExtra(Intent.EXTRA_TEXT, coffeeDescrption)
                this.type = "text/plain"
            }
            context?.startActivity(shareIntent)
        } else {
            return super.onOptionsItemSelected(item)
        }
        return true
    }
}