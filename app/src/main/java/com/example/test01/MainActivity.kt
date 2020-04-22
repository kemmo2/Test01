package com.example.test01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // val button = findViewById<Button>(R.id.button)
        // button.setOnClickListener {
        //     val textView = findViewById<TextView>(R.id.textView)
        //     textView.text = "changed"
        // }
    }
}
