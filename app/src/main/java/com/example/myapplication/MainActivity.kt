package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_start)
            .setOnClickListener {

                val num = Random.nextInt(1, 4)

                val intent = Intent(applicationContext, NextActivity::class.java)
                intent.putExtra("message_key", num.toString())
                startActivity(intent)
            }
    }
}