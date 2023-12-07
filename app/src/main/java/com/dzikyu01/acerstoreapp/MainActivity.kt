package com.dzikyu01.acerstoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAcer: RecyclerView
    private val list = ArrayList<Acer>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAcer = findViewById(R.id.rv_acer)
        rvAcer.setHasFixedSize(true)

        list.addAll(getlistAcer())
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAcer.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListAcerAdapter(list)
        rvAcer.adapter = listHeroAdapter
    }

    private fun getlistAcer(): ArrayList<Acer> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDiscription = resources.getStringArray(R.array.data_descrption)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)

        val listAcer = ArrayList<Acer>()

        for (i in dataName.indices) {
            val acer = Acer(dataName[i], dataDiscription[i],dataPhoto.getResourceId(i, -1))
            listAcer.add(acer)
        }
        return listAcer
    }
}
