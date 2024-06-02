package com.example.comicsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailEditText=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val passwordEditText=findViewById<EditText>(R.id.editTextTextPassword)
        val loginButton= findViewById<Button>(R.id.login)
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()



            if (email.isNotEmpty() && password.isNotEmpty()) {

                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()


                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)


                finish()
            } else {

                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }

