package com.example.lab2ex2emojimood

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var emoji = findViewById<ImageView>(R.id.emoji)
        var msg = findViewById<TextView>(R.id.message)
        var btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(){
            emoji.setImageResource(R.drawable.happy)
            msg.text = "I'm so full :)"
            btn.text = "Done"
        }
    }
}