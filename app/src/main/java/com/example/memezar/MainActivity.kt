package com.example.memezar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btNext=findViewById(R.id.btNext)
        btNext.setOnClickListener {
            val intent=Intent(this,MemeActivity3::class.java)
            startActivity(intent)
        }
    }
}
