package com.maulana.profilguru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Jurusansmk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jurusan)

        val to = findViewById<Button>(R.id.to)
        val pplg = findViewById<Button>(R.id.pplg)
        val tl = findViewById<Button>(R.id.tl)
        val busana = findViewById<Button>(R.id.busana)
        val kuliner = findViewById<Button>(R.id.kuliner)

        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, pplg())
            fragmentTransaction.commit()
        }

        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, kuliner())
            fragmentTransaction.commit()
        }

        tl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, tl())
            fragmentTransaction.commit()
        }
        to.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, to())
            fragmentTransaction.commit()
        }

        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, busana())
            fragmentTransaction.commit()
        }
    }
}