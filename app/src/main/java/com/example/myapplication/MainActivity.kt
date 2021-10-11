package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.show_text);
        val enteredText = findViewById<EditText>(R.id.enter_text);
        // val viewText = findViewById<TextView>(R.id.view_text);

        // Setting On Click Listener
        showButton.setOnClickListener {

            // Getting the user input
            val text = enteredText.text

            // Showing the user input
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }




}