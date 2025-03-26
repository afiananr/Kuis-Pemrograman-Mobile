package com.example.kuis

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import android.view.View
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_second)
        val colorBox = findViewById<View>(R.id.colorBox)
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        val titleText = findViewById<TextView>(R.id.tvTitle)

        val number = intent.getIntExtra("INPUT_NUMBER", 0)

        if (number % 2 == 0) {
            colorBox.setBackgroundColor(ContextCompat.getColor(this, R.color.blue))
        } else {
            colorBox.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
        }

        buttonBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}