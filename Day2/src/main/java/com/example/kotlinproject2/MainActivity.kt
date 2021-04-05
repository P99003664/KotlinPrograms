package com.example.kotlinproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
           /* var un=editTextTextPersonName.text.toString()
            Toast.makeText(this,"LOGIN BUTTON CLICKED",Toast.LENGTH_LONG).show()
            editTextTextPersonName.setText(un)
            var myIntent=Intent(this,MainActivity2::class.java)
            myIntent.putExtra("key",un)
            startActivity(myIntent)*/
            /*var i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i)*/
            var un=username.text
            var pwd=password.text
            if(un.equals("Bhagyasree") && pwd.equals("1234")) {
                var i = Intent(this, MainActivity2::class.java)
                startActivity(i)
            }
            else
            {
                var r = Intent(this, MainActivity::class.java)
                startActivity(r)
            }

        }
        button2.setOnClickListener{
            var sn=username.text.toString()
            Toast.makeText(this,"CANCEL BUTTON CLICKED",Toast.LENGTH_LONG).show()
            username.setText(sn)
            var myIntent=Intent(this,MainActivity3::class.java)
            startActivity(myIntent)
        }
    }
}


