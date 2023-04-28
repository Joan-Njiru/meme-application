package com.example.memezar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity4 : AppCompatActivity() {
    lateinit var btPrevious: Button
    lateinit var btNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btPrevious = findViewById(R.id.btPrevious)
        btPrevious.setOnClickListener {
            val intent = Intent(this, MemeActivity3::class.java)
        }
        btNext = findViewById(R.id.btNext)
        btNext.setOnClickListener {
            val intent = Intent(this, MemeActivity5::class.java)
            startActivity(intent)
        }

    }
}