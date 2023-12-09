package com.dzikyu01.acerstoreapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailAcerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_acer)

        val txtv = findViewById<TextView>(R.id.tv_item_name)
        txtv.text = intent.getStringExtra("nama")

        val photoImage = findViewById<ImageView>(R.id.iv_item_photo)
        photoImage.setImageResource(intent.getIntExtra("photo", R.drawable.acer_extansa_15))

        val descriptionText = findViewById<TextView>(R.id.tv_item_descacer)
        descriptionText.text = intent.getStringExtra("description")

        val buttonUrl = findViewById<Button>(R.id.button)
        val url = intent.getStringExtra("url")
        buttonUrl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)

            startActivity(intent)
        }
    }
}