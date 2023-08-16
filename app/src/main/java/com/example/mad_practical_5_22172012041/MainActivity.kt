package com.example.mad_practical_5_22172012041

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browsebutton:Button = findViewById(R.id.button_browse)
        val editTextBrowser:EditText = findViewById(R.id.editTextText2)

        browsebutton.setOnClickListener {
            openbrowse(editTextBrowser.text.toString())
        }
    }

    fun openbrowse(s:String)
    {
        Intent(Intent.ACTION_VIEW, Uri.parse(s)).also {
            startActivity(it)
        }
    }

    fun call(n:String)
    {

    }

    fun call_log()
    {

    }

    fun gallay(n:String)
    {

    }

    fun camera(n:String)
    {

    }

    fun alarm(n:String)
    {

    }


}