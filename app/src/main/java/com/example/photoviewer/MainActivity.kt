package com.example.photoviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bts1 = findViewById<ImageView>(R.id.bts1)
        bts1.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_SHORT).show()

            var intent = Intent(this,Img1Activity::class.java)
            startActivity(intent)

        }

    }
}