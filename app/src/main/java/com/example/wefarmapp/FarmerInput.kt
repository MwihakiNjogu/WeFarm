package com.example.wefarmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class FarmerInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmer_input)

        var listView= findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Model>()
        list.add(Model("Farmer","sales prodect",R.drawable.farm))
        list.add(Model("Farmer","sales prodect",R.drawable.farm))
        list.add(Model("Farmer","sales prodect",R.drawable.farm))

        listView.adapter=MyAdapter(this,R.layout.rows,list)
    }
}