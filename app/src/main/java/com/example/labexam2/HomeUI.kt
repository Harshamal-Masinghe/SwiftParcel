package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.ImageButton


class HomeUI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_ui)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSendPkg = findViewById<ImageButton>(R.id.btnSendPkg)
        btnSendPkg.setOnClickListener {

            val intent = Intent(this, ItemTypeUI::class.java)
            startActivity(intent)
        }

        val btnRecievePakage = findViewById<ImageButton>(R.id.btnRecievePkg)
        btnRecievePakage.setOnClickListener {

            val intent = Intent(this, ItemTypeUI::class.java)
            startActivity(intent)
        }

        //navigation bar
        val btnActivity = findViewById<ImageButton>(R.id.btnActivity)
        btnActivity.setOnClickListener {

            val intent = Intent(this, ActivityUI::class.java)
            startActivity(intent)
        }

        val btnNotification = findViewById<ImageButton>(R.id.btnNotification)
        btnNotification.setOnClickListener {

            val intent = Intent(this, NotificationUI::class.java)
            startActivity(intent)
        }

        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)
        btnProfile.setOnClickListener {

            val intent = Intent(this, ProfileUI::class.java)
            startActivity(intent)
        }
    }
}
