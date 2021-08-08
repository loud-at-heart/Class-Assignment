package com.example.classassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            startActivity(Intent(this, ClassTask1::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this, ClassTask2::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this, ClassTask2::class.java))
        }
        button3.setOnClickListener {
            startActivity(Intent(this, ClassTask3::class.java))
        }
        button4.setOnClickListener {
            startActivity(Intent(this, ClassTask4n6::class.java))
        }
        button5.setOnClickListener {
            startActivity(Intent(this, ClassTask5::class.java))
        }
        button6.setOnClickListener {
            startActivity(Intent(this, ClassTask7::class.java))
        }
        button7.setOnClickListener {
            startActivity(Intent(this, ClassTask9::class.java))
        }
    }
}