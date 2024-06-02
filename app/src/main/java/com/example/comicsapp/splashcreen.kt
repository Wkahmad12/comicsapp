package com.example.comicsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashcreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashcreen)
        android.os.Handler().postDelayed({
            startActivity(Intent(this, login::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}