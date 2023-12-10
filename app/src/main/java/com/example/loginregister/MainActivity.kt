package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton?.setOnClickListener {
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }
}