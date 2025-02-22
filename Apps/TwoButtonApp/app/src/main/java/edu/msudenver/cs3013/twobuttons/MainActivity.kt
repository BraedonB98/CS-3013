package edu.msudenver.cs3013.twobuttons

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.graphics.Color
import android.view.View

class MainActivity : AppCompatActivity() {
    private val yellow = Color.rgb(255, 255, 0)
    private val blue = Color.rgb(0, 0, 255)
    private val red = Color.rgb(255, 0, 0)
    private val cyan = Color.rgb(0, 255, 255)
    private var upFlag = true
    private var downFlag = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.downButton)
        button.setOnClickListener {
            Toast.makeText(this, "You clicked Lower Button.", Toast.LENGTH_SHORT).show()
            val text = findViewById<TextView>(R.id.downText)
            if (downFlag) {
                text.setBackgroundColor(blue)
                text.setTextColor(red)
                downFlag = false
            } else {
                text.setBackgroundColor(yellow)
                text.setTextColor(blue)
                downFlag = true
            }
        }
    }

    fun upToggle(v: View) {
        Toast.makeText(this, "You clicked Upper Button.", Toast.LENGTH_SHORT).show()
        val text = findViewById<TextView>(R.id.upText)
        if (upFlag) {
            text.setBackgroundColor(cyan)
            text.setTextColor(yellow)
            upFlag = false
        } else {
            text.setBackgroundColor(red)
            text.setTextColor(blue)
            upFlag = true
        }
    }
}