package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        supportActionBar?.hide()

        intentButtonMasuk()
    }

    private fun intentButtonMasuk() {
        val masuk = findViewById<Button>(R.id.startButton)
        masuk.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

