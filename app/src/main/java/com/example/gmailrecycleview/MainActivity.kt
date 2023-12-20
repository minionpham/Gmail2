package com.example.gmailrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>(
            ItemModel("Sarah", "Sed eu arcu ac quam egestas iaculis.", "Donec faucibus turpis sed leo convallis, id luctus enim tristique.", "12:15 PM"),
            ItemModel("David", "Nullam sit amet enim velit.", "Mauris quis magna ac ipsum fermentum tristique.", "11:00 AM"),
            ItemModel("John", "Vestibulum ante ipsum primis in faucibus orci luctus et ultricies posuere cubilia curae; Donec semper velit sit amet ligula fringilla, sit amet iaculis nulla pretium.", "Nam at felis eget neque semper bibendum.", "9:45 AM"),
            ItemModel("Emily", "Phasellus ac magna sed enim tincidunt bibendum.", "Fusce ut orci sit amet libero ultricies laoreet.", "8:30 AM"),
            ItemModel("Michael", "Sed et mauris sit amet nulla laoreet congue.", "Sed interdum erat et laoreet fringilla.", "7:15 AM"),
            ItemModel("Jessica", "Nullam sit amet tortor in ipsum ultricies tincidunt.", "Nulla facilisi.", "6:00 AM"),
            ItemModel("Daniel", "Curabitur vitae diam velit.", "Donec vel laoreet felis.", "4:45 PM"),
            ItemModel("Olivia", "Sed sit amet tellus sit amet quam semper luctus.", "Sed velit nibh, tristique vel lectus nec, scelerisque semper eros.", "3:30 PM"),
            ItemModel("William", "Sed ac elit vel enim faucibus pharetra.", "Nulla non enim tincidunt, aliquam mauris nec, feugiat odio.", "2:15 PM"),
            ItemModel("Sophia", "Nam et enim nec enim hendrerit gravida.", "Sed quis augue eget neque gravida semper.", "1:00 PM")
        )

        val adapter = ItemAdapter(items)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}