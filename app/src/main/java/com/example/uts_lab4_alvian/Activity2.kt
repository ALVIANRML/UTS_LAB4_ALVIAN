package com.example.uts_lab4_alvian

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import android.widget.ScrollView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val back : ImageButton = findViewById(R.id.back)
        back.setOnClickListener {
            // Intent untuk berpindah ke Activity2
            val intent = Intent(this@Activity2, Activity1::class.java)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.btnyoutube)
        button.setOnClickListener {
            val youtubeUrl = "https://youtu.be/t2ERtwoTw5w?si=rUNmTLAQeUbpbiMr" // Ganti VIDEO_ID dengan ID video yang diinginkan
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl))
            startActivity(intent)}
        val ScrollView = findViewById<ScrollView>(R.id.scroll)
    }
}