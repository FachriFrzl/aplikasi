package com.example.tugas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.txt3.*
import kotlinx.android.synthetic.main.txt4.*
import com.example.tugas.EXTRA_MESSAGE as EXTRA_MESSAGE

class Activiti3 :AppCompatActivity() {
    private lateinit var btm : Button
    private lateinit var txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.txt4)

        txt = findViewById(R.id.txtview)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val tn = "Beres! Sekarang "+message+ " udah bisa ngecek penggunaan HP mu tiap hari buat bantu "+message+" ngatur waktu :)"
        txt.setText(tn)

             }
        }

