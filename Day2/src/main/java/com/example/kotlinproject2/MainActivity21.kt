package com.example.kotlinproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main21.*

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main21)
        button3.setOnClickListener{
            Toast.makeText(this,"Clicked", Toast.LENGTH_LONG).show()
            var myIntent= Intent(this,MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}