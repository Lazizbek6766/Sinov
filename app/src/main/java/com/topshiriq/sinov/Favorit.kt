package com.topshiriq.sinov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Favorit : Fragment() {

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorit, container, false)


        recyclerView = view.findViewById(R.id.recycler_favorit)

        recyclerView.layoutManager = LinearLayoutManager(context)
        val myAdapter = MyAdapterSearch(context, Product.catygoryFavorite)
        recyclerView.adapter = myAdapter











        return view
    }

}