package com.dzikyu01.acerstoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainActivity : RecyclerView.Adapter<ListViewHolder.listAcerAdapter>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,

    ): listAcerAdapter.ListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: listAcerAdapter.ListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class ListViewHolder {

}

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
}