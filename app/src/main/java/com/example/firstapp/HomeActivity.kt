package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeTxt = findViewById<TextView>(R.id.home_text)
        val email = intent.getStringExtra("email")
        homeTxt.text = "Welcome $email"
    }
}