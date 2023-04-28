package com.example.memezar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity6 : AppCompatActivity() {
    lateinit var btPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme6)
        btPrevious = findViewById(R.id.btPrevious)
        btPrevious.setOnClickListener {
            val intent= Intent(this,MemeActivity5::class.java)
            startActivity(intent)
        }

    }
}