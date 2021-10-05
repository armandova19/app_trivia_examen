package com.udec.app_trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val correct_answer = findViewById<Button>(R.id.answer1)
        val incorrect_answer = findViewById<Button>(R.id.answer2)
        val incorrect_answer2 = findViewById<Button>(R.id.answer3)

        correct_answer.setOnClickListener(){

            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show()
            val intento2 = Intent(this, MainActivity3::class.java)
            startActivity(intento2)

        }
        incorrect_answer.setOnClickListener(){

            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show()
        }
        incorrect_answer2.setOnClickListener(){

            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show()
        }
    }
}