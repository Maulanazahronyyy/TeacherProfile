package com.maulana.profilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val biodataBtn =findViewById<Button>(R.id.biodata)
        val jurusanBtn =findViewById<Button>(R.id.jurusansmk)
        val aboutBtn = findViewById<Button>(R.id.about)

        biodataBtn.setOnClickListener {
            val intent = Intent(this, biodata::class.java)
            startActivity(intent)
        }
        jurusanBtn.setOnClickListener {
            val intent = Intent(this, Jurusansmk::class.java)
            startActivity(intent)
        }
        aboutBtn.setOnClickListener {
            val intent = Intent(this, about::class.java)
            startActivity(intent)
        }
    }
}