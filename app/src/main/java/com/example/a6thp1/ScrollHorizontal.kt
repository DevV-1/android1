package com.example.a6thp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ScrollHorizontal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_horizontal)

//        setContentView(R.layout.activity_scroll_horizontal) // horizontal
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Toast.makeText(this@ScrollHorizontal, "back pressed", Toast.LENGTH_SHORT).show()

    }

}
