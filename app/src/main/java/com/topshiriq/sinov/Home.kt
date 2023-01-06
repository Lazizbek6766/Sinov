package com.topshiriq.sinov

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : Fragment() {

    lateinit var recyclerView:RecyclerView
    lateinit var recyclerView2:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recycler)
        recyclerView2 = view.findViewById(R.id.recycler_2)

        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        val myAdapter = MyAdapter(context,Product().catygorytop)
        recyclerView.adapter = myAdapter


        recyclerView2.layoutManager = LinearLayoutManager(context)
        val myAdapterSearch = MyAdapterSearch(context, Product().catygory)
        recyclerView2.adapter = myAdapterSearch









        return view
    }

}