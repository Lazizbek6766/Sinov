package com.topshiriq.sinov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var button: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.navigation1)

        supportFragmentManager.beginTransaction().replace(R.id.layout1, Home()).commit()


        button.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item_1 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.layout1, Home()).commit()
                }
                R.id.item_2 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.layout1, Search()).commit()
                }
                R.id.item_3 -> {
                    Product.catygoryFavorite.distinct()
                    supportFragmentManager.beginTransaction().replace(R.id.layout1, Favorit()).commit()

                }
                R.id.item_4 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.layout1, Profil()).commit()
                }
                else -> {}
            }
            return@setOnItemSelectedListener true
        }












    }
}