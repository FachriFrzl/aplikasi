package com.example.tugas

import android.content.Context
import android.content.Context.DISPLAY_SERVICE
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activiti2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.txt3)


    }
    fun sendMessage()
    {
        lateinit var editText: EditText
        val intent = Intent(this,Activiti3::class.java)
        editText = findViewById(R.id.edit1)
        val message : String
        message = editText.toString()
        startActivity(intent)
    }
}