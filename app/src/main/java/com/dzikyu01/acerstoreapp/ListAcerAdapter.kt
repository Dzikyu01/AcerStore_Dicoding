package com.dzikyu01.acerstoreapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ListAcerAdapter (private val listAcer: ArrayList<Acer>) : RecyclerView.Adapter<ListAcerAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_acer, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val acer = listAcer[position]
        holder.imgPhoto.setImageResource(acer.photo)
        holder.tvName.text = acer.name
        holder.tvDescription.text = acer.description
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailAcerActivity::class.java).apply {
                putExtra("nama", acer.name)
                putExtra("description", acer.description)
                putExtra("photo", acer.photo)
            }

            startActivity(holder.itemView.context, intent, null)
        }
    }
    override fun getItemCount(): Int = listAcer.size
}