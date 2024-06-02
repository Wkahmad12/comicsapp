package com.example.comicsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class watch : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_watch)
        button=findViewById(R.id.spi)
        button.setOnClickListener {
            openUrl("https://flixhq.ws/movie/the-amazing-spider-man-80288/")
        }
        button2=findViewById(R.id.dead)
        button2.setOnClickListener {
            openUrl("https://flixhq.ws/movie/deadpool-72173/")
        }
        button3=findViewById(R.id.hk)
        button3.setOnClickListener {
            openUrl("https://flixhq.ws/movie/the-incredible-hulk-87361/")
        }
        button4=findViewById(R.id.superm)
        button4.setOnClickListener {
            openUrl("https://flixhq.ws/movie/superman-unbound-11235/")
        }
        button5=findViewById(R.id.thor)
        button5.setOnClickListener {
            openUrl("https://flixhq.ws/movie/thor-love-and-thunder-00362/")
        }

        button6=findViewById(R.id.bat)
        button6.setOnClickListener{
            openUrl("https://flixhq.ws/movie/the-batman-68568/"

            )
        }
    }
    private fun openUrl(url:String){
        val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
