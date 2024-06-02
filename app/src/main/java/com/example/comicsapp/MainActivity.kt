package com.example.comicsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val instructionIcon = findViewById<ImageView>(R.id.instruction_icon)

        button2.setOnClickListener {
            showPopup("Read Button Clicked", "You can enjoy reading comics here")
            val intent = Intent(this, read::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            showPopup("Watch Button Clicked", "You can enjoy watching comics here.")
            val intent = Intent(this, watch::class.java)
            startActivity(intent)
        }

        instructionIcon.setOnClickListener {
            showInstructions()
        }
    }

    private fun showPopup(title: String, message: String) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }

    private fun showInstructions() {
        AlertDialog.Builder(this)
            .setTitle("Instructions")
            .setMessage("this app is of reading and watching comics book and movie movies are online .so you can enjoy and have fun reading and watching comics")
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }
}
