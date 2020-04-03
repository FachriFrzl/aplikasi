package com.example.tugas

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.txt2.*

class Activiti :AppCompatActivity() {
    private lateinit var butn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.txt2) //03-04-2020
        butn = findViewById(R.id.btn1)
        butn.setOnClickListener{
            startActivity(Intent(this,Activiti2::class.java))

        }

    }
}