package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv = findViewById<RecyclerView>(R.id.myrecyclerview)

        myrv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var myDatalist = ArrayList<UsersData>()

        myDatalist.add(UsersData("chinni","chinni@gamil.com","987561234"))
        myDatalist.add(UsersData("pinky","pinky@gamil.com","9496258713"))
        myDatalist.add(UsersData("sai","sai@gamil.com","8179386258"))
        myDatalist.add(UsersData("dumbu","dumbu@gamil.com","9325874136"))
        myDatalist.add(UsersData("harish","harish@gamil.com","8123654791"))

        myrv.adapter = MyAdapter(myDatalist)

    }
}