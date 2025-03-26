package com.example.kuis2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etNpm = findViewById<EditText>(R.id.inputNpm)
        val btnCek = findViewById<Button>(R.id.btnCek)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnCek.setOnClickListener {
            val npm = etNpm.text.toString()

            if (npm.isEmpty()) {
                tvHasil.text = "Masukkan NPM dulu!"
            } else {
                if (npm.length >= 11) {
                    tvHasil.text = "NPM kamu panjang!"
                } else {
                    tvHasil.text = "NPM kamu pendek!"
                }
            }
        }
    }
}