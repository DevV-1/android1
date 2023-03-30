package com.example.a6thp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class CA1 : AppCompatActivity() {
    lateinit var txtView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca1)
        val pgBar = findViewById<ProgressBar>(R.id.pBar)
        val btn = findViewById<Button>(R.id.btn)
        val txt = findViewById<TextView>(R.id.tView)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        txtView = findViewById(R.id.txtView)
        var i=pgBar.progress
//        btn.setOnClickListener() {
//            Thread() {
//                while (i<100) {
//                    i+=1
//                    Handler(Looper.getMainLooper()).post( {
//                        pgBar.progress=i
//                        txtView.text= i.toString()+ "/"+pgBar.max
//                    }
//                }.start()
//
//            }
//        bottomNav.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.cgpa1 -> {
//                    setContent("8.7")
//                    true
//                }
//                R.id.cgpa2 -> {
//                    setContent("8.4")
//                    true
//                }
//                R.id.cgpa3 -> {
//                    setContent("9.1")
//                    true
//                }
//                R.id.cgpa4 -> {
//                    setContent("8.7")
//                    true
//                }
//                else -> false
//            }
//        }
//    }

     fun setContent(content: String) {
        setTitle(content)
        txt.text = content
    }

}
}

