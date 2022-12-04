package com.example.android_fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.myBtn)
        val content = findViewById<TextView>(R.id.content)
        var timeClicked : Int = 0

        btn.setOnClickListener {
            timeClicked++;
            content.text = timeClicked.toString()

            val toast = Toast.makeText(this,
                timeClicked.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}