package com.udec.app_trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<EditText>(R.id.text1)
        val gobutton = findViewById<Button>(R.id.save_button)


        gobutton.setOnClickListener(){
           if (text1.text.isEmpty()){
                Toast.makeText(this, "please type something", Toast.LENGTH_SHORT).show()
            }
            val name = text1.text
            Toast.makeText(this, "Bienvenido $name", Toast.LENGTH_SHORT).show()
            val intento1 = Intent(this, MainActivity2::class.java)
            startActivity(intento1)

        }

    }
}