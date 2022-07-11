package com.example.cvmobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card = findViewById<CardView>(R.id.background_card)
        card.setOnClickListener {
            startActivity(Intent(this,Background::class.java))
        }
    }

    }

