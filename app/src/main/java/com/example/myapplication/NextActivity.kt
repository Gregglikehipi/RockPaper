package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val intent = intent
        val num = intent.getStringExtra("message_key")?.toInt()
        val textView: TextView = findViewById(R.id.output) as TextView

        findViewById<Button>(R.id.button_1)
            .setOnClickListener {
                if (num == 1)
                    textView.text = "Ничья"
                if (num == 2)
                    textView.text = "Победа"
                if (num == 3)
                    textView.text = "Проигрыш"
            }
        findViewById<Button>(R.id.button_2)
            .setOnClickListener {
                if (num == 1)
                    textView.text = "Проигрыш"
                if (num == 2)
                    textView.text = "Ничья"
                if (num == 3)
                    textView.text = "Победа"
            }
        findViewById<Button>(R.id.button_3)
            .setOnClickListener {
                if (num == 1)
                    textView.text = "Победа"
                if (num == 2)
                    textView.text = "Проигрыш"
                if (num == 3)
                    textView.text = "Ничья"
            }
        findViewById<Button>(R.id.button_back)
            .setOnClickListener {
                val intent_back = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent_back)
            }

    }
}