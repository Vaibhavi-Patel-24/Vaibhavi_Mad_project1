package com.example.vaibhavi_mad_project1

import android.content.Context
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
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
    }

    var arrayList = arrayOf(
        "vaibhavi",
        "CE",
        "22012011094"
    )
    var arrayList_1 = arrayOf(
        Contact("1", "7575819534", "vaibhavi", "patel", "patan", "patan")
    )

    val spinner:Spinner = findViewById<Spinner>(R.id.spinner_1)
    val spinner_adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayList)

}

data class Contact(
        val id : String,
        val phone: String,
        val first_name:String,
        val last_name:String,
        val street:String,
        val city:String
        )

class  ContactAdapter(context: Context,
    contacts: Array<Contact>):
        ArrayAdapter<Contact>(context,0,contacts){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listItemView = convertView

        if(listItemView == null){
            LayoutInflater.from(context).inflate(R.layout.single_contact_person,parent,false)
        }
        val currentContact=getItem(position)

        val nameTextView=listItemView.findViewById<>()
    }
        }