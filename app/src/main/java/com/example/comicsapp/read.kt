package com.example.comicsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class read : AppCompatActivity() {
    lateinit var button7: Button
    lateinit var button8:Button
    lateinit var button9: Button
    lateinit var button10:Button
    lateinit var button11: Button
    lateinit var button12:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read)
        button7=findViewById(R.id.spi)
        button7.setOnClickListener {
            openUrl("https://drive.google.com/file/d/0B8S09qODXLIHRFkxZ2JFamxNMHc/view?resourcekey=0-M86o4578F9yM3ySLQxqxKA")
        }
        button8=findViewById(R.id.dead)
        button8.setOnClickListener {
            openUrl("https://drive.google.com/file/d/0B8S09qODXLIHNlk5NzhqbXFPM0k/view?resourcekey=0-6ivqisISrXFZyDSezrF2jg")
        }
        button9=findViewById(R.id.hk)
        button9.setOnClickListener {
            openUrl("https://drive.google.com/file/d/0B8S09qODXLIHMW9lN3VpZ0p2VEU/edit?resourcekey=0-ok5rMpXInLu1N2SnnZCJGg")
        }
        button10=findViewById(R.id.superm)
        button10.setOnClickListener {
            openUrl("https://drive.google.com/file/d/0B8S09qODXLIHMmtBQzRKWnQtVFk/view?resourcekey=0-brgoe2vQjpwDkwiYjPjytA")
        }
        button11=findViewById(R.id.thhor)
        button11.setOnClickListener {
            openUrl("https://drive.google.com/file/d/0B8S09qODXLIHN1V2aDNFcFR6SGM/view?resourcekey=0-W15F_a7z2jmVJsopLKoLiw")
        }

        button12=findViewById(R.id.bat)
        button12.setOnClickListener{
            openUrl("https://drive.google.com/file/d/0B8S09qODXLIHMFZYVmZPSzZ6LUE/view?resourcekey=0-Luxz7sZtUXDFzIDI8LN11A"

            )
        }
    }
    private fun openUrl(url:String){
        val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}