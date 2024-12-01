package com.example.pizzit

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // Ensure your theme supports edge-to-edge.
        setContentView(R.layout.activity_page3)

        // Handle window insets to provide padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the click listener for imageView13
        val imageView13 = findViewById<ImageView>(R.id.imageView13)
        imageView13.setOnClickListener {
            val intent1 = Intent(this, home1::class.java)
            startActivity(intent1)
        }

        // Set up the click listener for imageView16
        val imageView16 = findViewById<ImageView>(R.id.imageView16)
        imageView16.setOnClickListener {
            val intent1 = Intent(this, home1::class.java)
            startActivity(intent1)
        }
    }
}
