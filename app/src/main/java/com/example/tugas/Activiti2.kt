package com.example.tugas

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
const val EXTRA_MESSAGE = "com.example.tugas.MESSAGE"
class Activiti2 : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.txt3)
        button = findViewById(R.id.but)
        button.setOnClickListener {
            startActivity(Intent(this, Activiti3::class.java))
        }

        button.setOnClickListener()
        {
            val editText = findViewById<EditText>(R.id.edit1)
            val btw = editText.text.toString()
            val intent = Intent(this, Activiti3::class.java).apply { putExtra(EXTRA_MESSAGE, btw) }
            startActivity(intent)

        }
    }
}

