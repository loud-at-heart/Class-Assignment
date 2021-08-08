package com.example.classassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_class_task2.*

class ClassTask2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_task2)
        bt_change_color.setOnClickListener {
            bt_change_color.isSelected = !bt_change_color.isSelected
        }
    }
}