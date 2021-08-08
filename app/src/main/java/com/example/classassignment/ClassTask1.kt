package com.example.classassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_class_task1.*

class ClassTask1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_task1)


        bt_login.setOnClickListener {
            val username = et_username.text;
            val password = et_password.text;
            if(username.toString().trim()!="pritam".trim() && password.toString().trim()!="abc".trim()){
//                et_username.requestFocus()
                et_username.selectAll()
//                et_password.requestFocus()
                et_password.selectAll()
                Toast.makeText(this, "Please Enter valid Username and Password", Toast.LENGTH_SHORT).show()
            }
            else if(username.toString().trim()!="pritam".trim()){
                et_username.requestFocus()
                et_username.selectAll()
                Toast.makeText(this, "Please Enter valid Username", Toast.LENGTH_SHORT).show()
            }
            else if(password.toString().trim()!="abc".trim()){
                et_password.requestFocus()
                et_password.selectAll()
                Toast.makeText(this, "Please Enter valid Password", Toast.LENGTH_SHORT).show()
            }
            else{
//                startActivity(Intent(this,MainActivity::class.java))
                Toast.makeText(this, "Credentials Matched", Toast.LENGTH_SHORT).show()
            }


        }
    }
}