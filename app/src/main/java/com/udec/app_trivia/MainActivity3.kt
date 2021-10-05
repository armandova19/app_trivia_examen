package com.udec.app_trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val good_answer = findViewById<Button>(R.id.answer23)
        val bad_answer = findViewById<Button>(R.id.answer22)
        val bad_answer2 = findViewById<Button>(R.id.answer21)

        good_answer.setOnClickListener(){

            Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show()
            val intento3 = Intent(this, MainActivity4::class.java)
            startActivity(intento3)

        }
        bad_answer.setOnClickListener(){

            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show()
        }
        bad_answer2.setOnClickListener(){

            Toast.makeText(this, "Incorrect answer", Toast.LENGTH_SHORT).show()
        }


    }
}