package com.example.pizzit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        // Set up the window insets listener
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up the click listener for imageView17
        val imageView17 = findViewById<ImageView>(R.id.imageView17)
        imageView17.setOnClickListener {
            val intent1 = Intent(this, home1::class.java)
            startActivity(intent1)
        }

        // Set up the click listener for imageView18
        val imageView18 = findViewById<ImageView>(R.id.imageView18)
        imageView18.setOnClickListener {
            val intent1 = Intent(this, home1::class.java)
            startActivity(intent1)
        }


        }
    }
