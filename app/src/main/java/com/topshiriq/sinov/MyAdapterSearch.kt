package com.topshiriq.sinov

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterSearch (
    val context: Context?,
    val catygory: MutableList<Catygory>
        ) : RecyclerView.Adapter<MyAdapterSearch.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.namuna_search, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource(catygory[position].image)
        holder.category.text = catygory[position].category
        holder.name.text = catygory[position].name
        holder.narx.text = "${catygory[position].narx} $"


        holder.imageFavorit.setOnClickListener {
            holder.imageFavorit.setImageResource(R.drawable.ic_baseline_favorite_24)
            if (Product.catygoryFavorite.contains(catygory[position])){

            }else {
                Product.catygoryFavorite.add(catygory[position])
            }
        }

    }

    override fun getItemCount(): Int = catygory.size



    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.image)
        val imageFavorit = itemView.findViewById<ImageView>(R.id.image_favorit)
        val category = itemView.findViewById<TextView>(R.id.text_catigory)
        val name = itemView.findViewById<TextView>(R.id.text_name)
        val narx = itemView.findViewById<TextView>(R.id.text_narx)
        val btnLayout = itemView.findViewById<LinearLayout>(R.id.btn_layner)
    }
}