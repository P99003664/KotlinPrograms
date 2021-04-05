package com.example.kotlinproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button5.setOnClickListener{
           /* var un=editTextTextPersonName.text.toString()*/
            Toast.makeText(this,"Clicked", Toast.LENGTH_LONG).show()
           /* editTextTextPersonName.setText(un)*/
            var myIntent= Intent(this,MainActivity21::class.java)
            var res=intent.extras!!.getString("key")
            username.setText(res)
            startActivity(myIntent)
        }
    }
}


