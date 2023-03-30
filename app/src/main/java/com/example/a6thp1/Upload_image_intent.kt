package com.example.a6thp1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class Upload_image_intent : AppCompatActivity() {

    lateinit var uploadImage: Button
    lateinit var iv: ImageView
    lateinit var filepath: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_image_intent)
        uploadImage = findViewById(R.id.btn_upload_image)

        iv = findViewById(R.id.image_preview)

        val ip = registerForActivityResult(ActivityResultContracts.GetContent())
        {
            filepath = it!!
            iv.setImageURI(it)
        }
        uploadImage.setOnClickListener() {
            ip.launch("image/*")

        }
    }
}
