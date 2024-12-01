package com.example.pizzit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up click listeners for all ImageViews
        setClickListener(R.id.imageView4)
        setClickListener(R.id.imageView5)
        setClickListener(R.id.imageView6)
        setClickListener(R.id.imageView7)
        setClickListener(R.id.imageView8)
        setClickListener(R.id.imageView9)

        // Set up a click listener for imageView3
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent1 = Intent(this, page3::class.java)
            startActivity(intent1)
        }
    }

    private fun setClickListener(imageViewId: Int) {
        findViewById<ImageView>(imageViewId).setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }
    }
}
