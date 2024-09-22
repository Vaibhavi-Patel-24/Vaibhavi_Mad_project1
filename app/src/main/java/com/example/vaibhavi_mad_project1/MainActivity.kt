package com.example.vaibhavi_mad_project1

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val listView = findViewById<ListView>(R.id.list_view)
//
//        var arrayList = arrayOf(
//            "vaibhavi",
//            "CE",
//            "22012011094"
//        )
        var arrayList_1 = arrayOf(
            Contact("1", "7575819534", "vaibhavi", "patel", "patan", "patan")
        )
        listView.adapter = ContactAdapter(this,arrayList_1.toList())

    }



}


