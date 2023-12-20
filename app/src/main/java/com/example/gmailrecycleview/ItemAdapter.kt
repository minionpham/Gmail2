package com.example.gmailrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val items: ArrayList<ItemModel>): RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.avatar.text = items[position].name[0].toString()
        holder.name.text = items[position].name
        holder.header.text = items[position].title
        holder.content.text = items[position].content
        holder.time.text = items[position].time

        if (items[position].ticked) {
            holder.favorite.setImageResource(R.drawable.favorite_ticked)
        } else {
            holder.favorite.setImageResource(R.drawable.favorite)
        }

        holder.favorite.setOnClickListener {
            items[position].ticked = !items[position].ticked
            notifyItemChanged(position)
        }
    }
}

class ItemViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    val avatar: TextView
    val name: TextView
    val header: TextView
    val content: TextView
    val time: TextView
    val favorite: ImageView

    init {
        avatar = itemView.findViewById(R.id.avatar)
        name = itemView.findViewById(R.id.name)
        header = itemView.findViewById(R.id.header)
        content = itemView.findViewById(R.id.content)
        time = itemView.findViewById(R.id.time)
        favorite = itemView.findViewById(R.id.favorite)
    }
}