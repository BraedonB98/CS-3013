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
        
        //*log.<priority> (<logLevel>,<tag>, <text>)
        /*Tag Convention 
        Tag = <appName>:<module/component name/identifier>
        Example com.yourcompany.app:Network*/
       
        /*Log Levels
        2 = Verbose
        3 = Debug
        4 = Info
        5 = Warn 
        6 = Error 
        7 = Assert */

        /* Priority
        Log.v()
        Log.d()
        Log.i()
        Log.w()
        Log.e()
        Log.wtf()
        Log.println()
        */


        log.e("Two Out", "=== Up n At Em Error ===")
        log.wtf("Two Out", "=== Up n At Em Error ===")
        log.println(7,"Two_Out", "<<<<<<<<<< HERE I AM >>>>>>>>>")//ASSERTS level
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}