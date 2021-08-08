package com.example.classassignment

import android.app.AlertDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_class_task4n6.*

class ClassTask4n6 : AppCompatActivity() {
    var data = arrayListOf<String>()
    lateinit var adapter: WordsAdapter
    lateinit var recyclerView: RecyclerView
    var TAG = ClassTask4n6::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_task4n6)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = WordsAdapter(data) { s: String, i: Int ->
            Log.e(TAG, "Clicked on item  ${s} at position $i")
            Snackbar.make(
                findViewById(android.R.id.content), "Clicked on item  ${s} at position $i",
                Snackbar.LENGTH_LONG
            )
                .setAction("Action", null)
                .show()
            showDefaultDialog(s, i)

        }
        recyclerView.adapter = adapter
    }

    fun addToView(view: View) {
        if (et_recycler_add_text.text.toString().trim() != "") {
            var text = et_recycler_add_text.text.toString()
            et_recycler_add_text.setText("")
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(view.windowToken, 0)
            //data.set(4,text)
            data.add(text)
            adapter.notifyDataSetChanged()
            fab_recycler_view.setVisibility(View.VISIBLE)
            et_recycler_add_text.setVisibility(View.INVISIBLE)
            bt_pass.setVisibility(View.INVISIBLE)
        } else {
            Snackbar.make(
                view, "Enter Some Text !",
                Snackbar.LENGTH_LONG
            )
                .setAction("Action", null)
                .show()
        }

    }

    fun fab(view: View) {
        fab_recycler_view.setVisibility(View.INVISIBLE)
        et_recycler_add_text.setVisibility(View.VISIBLE)
        bt_pass.setVisibility(View.VISIBLE)
    }

    private fun showDefaultDialog(s: String, i: Int) {
        val alertDialog = AlertDialog.Builder(this)

        alertDialog.apply {
            setTitle("Tile No - $i clicked")
            setMessage("The content in Tile $i is $s")
            setPositiveButton("Ok") { dialog, _ ->
                dialog.dismiss()
            }
        }.create().show()
    }
}