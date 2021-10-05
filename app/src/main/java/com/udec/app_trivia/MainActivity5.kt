package com.udec.app_trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val desc_name = findViewById<TextView>(R.id.text_name)
        val text1 = findViewById<EditText>(R.id.text1)
        val retry = findViewById<Button>(R.id.id_tryagain)
        retry.setOnClickListener(){
            //val intento5 = Intent(this, MainActivity::class.java)
            //startActivity(intento5)
            finish()

        }
        desc_name.text = text1.text
    }
}