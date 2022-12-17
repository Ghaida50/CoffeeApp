package com.example.coffeeapp.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeapp.adapter.CoffeeAdapter
import com.example.coffeeapp.data.Datasource
import com.example.coffeeapp.databinding.FragmentCoffeeDrinksBinding

class CoffeeDrinksFragment : Fragment() {
    private var _binding: FragmentCoffeeDrinksBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView

    /* override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

     }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCoffeeDrinksBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        val datset = Datasource().loadData()
        recyclerView.adapter = CoffeeAdapter(this.requireContext(), datset)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }// end onDestroyView

}