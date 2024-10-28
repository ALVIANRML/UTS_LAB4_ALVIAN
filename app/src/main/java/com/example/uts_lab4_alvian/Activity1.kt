package com.example.uts_lab4_alvian

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val f1: FrameLayout = findViewById(R.id.f1)
        val f2: FrameLayout = findViewById(R.id.f2)

        // Set OnClickListener untuk f1
        f1.setOnClickListener {
            // Intent untuk berpindah ke Activity2
            val intent = Intent(this@Activity1, Activity2::class.java)
            startActivity(intent)
        }
        val scrollView = findViewById<HorizontalScrollView>(R.id.scrollbutton)
        val scrollimage = findViewById<HorizontalScrollView>(R.id.scrollbuttonimage)
    }
}