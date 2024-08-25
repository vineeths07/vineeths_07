package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val frst_num = findViewById<EditText>(R.id.et_1st_number)
        val sec_num = findViewById<EditText>(R.id.et_2nd_number)
        val res = findViewById<TextView>(R.id.tv_result)
        val add = findViewById<Button>(R.id.btn_click_here)

        add.setOnClickListener {
            val firstnumber = frst_num.text.toString().toFloat()
            val secoundNumber = sec_num.text.toString().toFloat()
            val result = firstnumber + secoundNumber
            res.text = result.toString()
        }
    }
}