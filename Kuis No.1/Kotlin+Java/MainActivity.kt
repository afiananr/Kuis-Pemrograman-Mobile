package com.example.kuis

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val buttonNext = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val inputText = editTextNumber.text.toString()

            if (inputText.isEmpty()) {
                Toast.makeText(this, "Masukkan angka terlebih dahulu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val number = inputText.toInt()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("INPUT_NUMBER", number)
            startActivity(intent)
        }
    }
}