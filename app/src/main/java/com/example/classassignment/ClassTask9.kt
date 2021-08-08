package com.example.classassignment

import android.os.BatteryManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_class_task9.*

class ClassTask9 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_task9)
        btn_tap.setOnClickListener{

            // Call battery manager service
            val bm = applicationContext.getSystemService(BATTERY_SERVICE) as BatteryManager

            // Get the battery percentage and store it in a INT variable
            val batLevel:Int = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY)

            // Display the variable using a Toast
            Toast.makeText(applicationContext,"Battery is $batLevel%",Toast.LENGTH_LONG).show()
        }
    }
}