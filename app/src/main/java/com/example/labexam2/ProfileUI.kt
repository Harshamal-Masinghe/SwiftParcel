package com.example.labexam2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileUI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_ui)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnlogout = findViewById<Button>(R.id.btnlogout)
        btnlogout.setOnClickListener {
            val intent = Intent(this, LoginUI::class.java)
            startActivity(intent)
        }

        //navigation bar
        val btnHome = findViewById<ImageButton>(R.id.btnHome)
        btnHome.setOnClickListener {

            val intent = Intent(this, HomeUI::class.java)
            startActivity(intent)
        }

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
    }
}
//change