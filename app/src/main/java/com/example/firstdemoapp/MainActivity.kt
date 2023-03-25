package com.example.firstdemoapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import androidx.core.view.ViewCompat.setBackground

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnUpload = findViewById<Button>(R.id.btnUpload)
        val BtnDownload = findViewById<Button>(R.id.btnDownload)
        val Darkq = findViewById<Button>(R.id.btnIntent1)
        val  Yellowq = findViewById<Button>(R.id.btnIntent2)
        val Webq = findViewById<Button>(R.id.btnExpintent)
        val Cameraq = findViewById<Button>(R.id.btnExpintent2)

        BtnDownload.setOnClickListener {
            Toast.makeText(this,"Downloading...",Toast.LENGTH_LONG).show()
        }
        BtnUpload.setOnClickListener {
            Toast.makeText(this,"Uploading...",Toast.LENGTH_LONG).show()
        }
        Yellowq.setOnClickListener {
            val intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }

      Webq.setOnClickListener {
          val intent = Intent(Intent.ACTION_VIEW)
          intent.data = Uri.parse("https://stackoverflow.com/questions/18101390/what-is-the-difference-between-setbackgroundresource-and-setbackgrounddrawable")
          startActivity(intent)
      }
        Cameraq.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }



    }
}