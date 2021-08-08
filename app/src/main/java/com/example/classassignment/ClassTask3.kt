package com.example.classassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_class_task3.*

class ClassTask3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_task3)

        bt_popup.setOnClickListener{
            val popup = PopupMenu(this,bt_popup)
            popup.inflate(R.menu.activity_menu_items)
            popup.setOnMenuItemClickListener {
                Toast.makeText(this,"Item :"+it.title, Toast.LENGTH_SHORT).show()
                true
            }
            popup.show()
        }
    }
}