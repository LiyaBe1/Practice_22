package com.example.helloandroid

import android.annotation.SuppressLint
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var btnHello: Button
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHello = findViewById(R.id.button2);

        btnHello.setOnClickListener {
            val avd = resources.getDrawable(R.drawable.hello_android_waving) as AnimatedVectorDrawable
            btnHello.setCompoundDrawablesWithIntrinsicBounds(avd, null, null, null)
            avd.start()
        }
        }

    }