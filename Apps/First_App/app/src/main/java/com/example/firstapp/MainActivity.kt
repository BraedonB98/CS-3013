package com.example.firstapp

import android.widget.Toast
//import android.log //!finish this
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, log.eHere I Am ===" , Toast.LENGTH_LONG).show()
        // log.<> (<tag>, <Text>,)
        log.e("Two Out", "=== Up n At Em Error ===")
        log.wtf("Two Out", "=== Up n At Em Error ===")
        log.println(7,"Two_Out", "<<<<<<<<<<HERE I AM >>>>>>>>>")//ASSERTS level
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}