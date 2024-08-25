package com.example.listview

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.Submit_Button)
        val firstname = findViewById<EditText>(R.id.First_Name)
        val lastname = findViewById<EditText>(R.id.Last_Name)
        val birthday = findViewById<EditText>(R.id.Birthday)
        val email = findViewById<EditText>(R.id.Email)
        val countbtn = findViewById<Button>(R.id.btn_count_increase)
        val countstext = findViewById<TextView>(R.id.tv_Count)
        var count =0

        submitButton.setOnClickListener {

            val frstname = firstname.text.toString()
            val lstname = lastname.text.toString()
            val brday = birthday.text.toString()
            val mail = email.text.toString()
            Log.d(
                "Main Activity",
                "Dear $frstname $lstname, your birthday is on $brday wishes will be sent to $mail"
            )
        }
        countbtn.setOnClickListener {
            count++
            countstext.text = "count_will_increase_here: $count"
        }
    }
}