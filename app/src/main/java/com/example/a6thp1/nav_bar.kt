package com.example.a6thp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class nav_bar : AppCompatActivity() {
    lateinit var tvLabel: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_bar)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        tvLabel = findViewById(R.id.tvLabel)

//            bottomNav.setOnItemSelectedListener {
//                when (it.itemId) {
//                    R.id.menu_home -> {
//                        setContent("Home")
//                        true
//                    }
//                    R.id.menu_notification -> {
//                        setContent("Notification")
//                        true
//                    }
//                    R.id.menu_search -> {
//                        setContent("Search")
//                        true
//                    }
//                    R.id.menu_profile -> {
//                        setContent("Profile")
//                        true
//                    }
//                    else -> false
//                }
//            }
//        }
//        private fun setContent(content: String) {
//            setTitle(content)
//            tvLabel.text = content
//        }
    }
}
