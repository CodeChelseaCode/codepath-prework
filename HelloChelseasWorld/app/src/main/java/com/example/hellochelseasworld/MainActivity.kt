package com.example.hellochelseasworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Refer to your button.
        findViewById<Button>(R.id.button).setOnClickListener {
        Log.i("Chelsea", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("User", "Tapped on button")

        }
               }
    }
