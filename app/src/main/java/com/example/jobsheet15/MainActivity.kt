package com.example.jobsheet15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi Berjalan", Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.tombolToast)

        tombol.setOnClickListener {
            Toast.makeText(this, "Tombol ditekan", Toast.LENGTH_SHORT).show()
        }
    }
}