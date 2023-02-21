package com.example.upa_xipplg2_3029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val biodataActivity = findViewById<Button>(R.id.buttonbiodata)
        biodataActivity.setOnClickListener {
            val intent = Intent(this,BiodataActivity::class.java)
            startActivity(intent)
        }
        val pendidikanActivity= findViewById<Button>(R.id.buttonpendidikan)
        pendidikanActivity.setOnClickListener {
            val intent = Intent(this, PendidikanActivity::class.java)
            startActivity(intent)
        }
        val portofolioActivity= findViewById<Button>(R.id.buttonportofolio)
        portofolioActivity.setOnClickListener {
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)

        }
    }

}

