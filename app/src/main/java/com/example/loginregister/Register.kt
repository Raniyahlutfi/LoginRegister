package com.example.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnregister?.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }
}

private fun Any.setOnClickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}
