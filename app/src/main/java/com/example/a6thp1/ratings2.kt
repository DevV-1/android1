package com.example.a6thp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class ratings2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ratings2)
        val rb: RatingBar = findViewById(R.id.ratingBar1)
        val rateT: TextView = findViewById(R.id.ratetext)
        val subBtn: Button = findViewById(R.id.btnRateSubmit)

        val rb1: RatingBar = findViewById(R.id.rate1)
        val rb2: RatingBar = findViewById(R.id.rate2)
        val rb3: RatingBar = findViewById(R.id.rate3)
        val rb4: RatingBar = findViewById(R.id.rate4)


        subBtn.setOnClickListener() {
            var rating = "Rating :: " + rb.rating

            var r1 = rb1.rating
            var r2 = rb2.rating
            var r3 = rb3.rating
            var r4 = rb4.rating

            var avg = (r1 + r2 + r3 + r4) / 4


            rb.rating = avg

            when (avg.toInt()) {
                5 -> {
                    rateT.setText("best")
                }

                4 -> {
                    rateT.setText("good")
                }
                3 -> {
                    rateT.setText("average")
                }
                2 -> {
                    rateT.setText("bad")
                }
                else ->
                    rateT.setText("worst")
            }
        }
    }
}