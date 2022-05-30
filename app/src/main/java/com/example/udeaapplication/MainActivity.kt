package com.example.udeaapplication

import android.app.Activity
import android.os.Bundle
import com.example.udeaapplication.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.registerButton.setOnClickListener{
            val name = mainBinding.nameEditText.text.toString()
            val lastname = mainBinding.lastNameEditText.text.toString()
            val email = mainBinding.emailEditText.text.toString()

            mainBinding.infoTextView.text = name + "\n" + lastname + "\n"+ email
        }
    }
}