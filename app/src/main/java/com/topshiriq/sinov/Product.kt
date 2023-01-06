package com.topshiriq.sinov

class Product {

    val catygorytop = mutableListOf(
        Catygory(R.drawable.palov1, "Palov", "Palov 1", 3.0),
        Catygory(R.drawable.moshxorda1, "Moshxorda", "Moshxorda 1", 2.0),
        Catygory(R.drawable.fastfood1, "Fast Food", "Fast Food 1", 1.0),
        Catygory(R.drawable.meva1, "Meva", "Meva 1", 5.0),
    )
    val catygory = mutableListOf(
        Catygory(R.drawable.palov1, "Palov", "Palov 1", 3.0),
        Catygory(R.drawable.palov2, "Palov", "Palov 2", 4.0),
        Catygory(R.drawable.palov3, "Palov", "Palov 3", 5.0),
        Catygory(R.drawable.moshxorda1, "Moshxorda", "Moshxorda 1", 2.0),
        Catygory(R.drawable.moshxorda2, "Moshxorda", "Moshxorda 2", 1.0),
        Catygory(R.drawable.moshxorda3, "Moshxorda", "Moshxorda 3", 3.0),
        Catygory(R.drawable.fastfood1, "Fast Food", "Fast Food 1", 1.0),
        Catygory(R.drawable.fastfood2, "Fast Food", "Fast Food 2", 1.5),
        Catygory(R.drawable.fastfood3, "Fast Food", "Fast Food 3", 1.8),
        Catygory(R.drawable.meva1, "Meva", "Meva 1", 5.0),
        Catygory(R.drawable.meva2, "Meva", "Meva 2", 6.0),
        Catygory(R.drawable.meva3, "Meva", "Meva 3", 5.5)
    )
    companion object {
        val catygoryFavorite = mutableListOf<Catygory>()
    }

}