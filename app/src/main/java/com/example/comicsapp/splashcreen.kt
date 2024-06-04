package com.example.comicsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class splashcreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashcreen)

        val videoView = findViewById<VideoView>(R.id.video)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.marvel

        val videoURI = Uri.parse(videoPath)
        videoView.setVideoURI(videoURI)
        videoView.start()

        videoView.setOnCompletionListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
    }
}
