package com.dzikyu01.acerstoreapp

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailAcerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_acer)

        val txtv = findViewById<TextView>(R.id.tv_item_name)
        txtv.text = intent.getStringExtra("nama")
    }
}