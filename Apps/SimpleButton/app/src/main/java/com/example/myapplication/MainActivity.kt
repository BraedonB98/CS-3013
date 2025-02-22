package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.graphics.Color


class MainActivity : AppCompatActivity() {
    val yellow = Color.rgb(255,255,0)
    val blue = Color.rgb(0,0,255)
    val red = Color.rgb(255,0,0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var flag = true
        val button = findViewById<Button>(R.id.pbutton)
        button.setOnClickListener {
            Toast.makeText(this, "You clicked Push Button.", Toast.LENGTH_SHORT).show()
            val text = findViewById<TextView>(R.id.pbtext)
            if(flag){
                text.setBackgroundColor(yellow)
                flag = false
            }
            else{
                text.setBackgroundColor(red)
                flag = true
            }
        }


        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }
}
