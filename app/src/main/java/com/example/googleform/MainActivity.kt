package com.example.googleform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.widget.TextSwitcher
import android.widget.Toast
import com.example.googleform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var zeyad : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        zeyad= ActivityMainBinding.inflate(layoutInflater)
        setContentView(zeyad.root)
        zeyad.button.setOnClickListener{
            Toast.makeText(this, "thank you..you Create a fake Account ", Toast.LENGTH_SHORT).show()
        }

        }

        }

