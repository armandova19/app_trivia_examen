package com.udec.app_trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)



        val good_answer1 = findViewById<Button>(R.id.answer33)
        val bad_answer1 = findViewById<Button>(R.id.answer32)
        val bad_answer3 = findViewById<Button>(R.id.answer31)

        good_answer1.setOnClickListener(){

            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show()
            val intento4 = Intent(this, MainActivity5::class.java)
            startActivity(intento4)

        }
        bad_answer1.setOnClickListener(){

            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show()
        }
        bad_answer3.setOnClickListener(){

            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show()
        }
    }
}