package com.example.classassignment

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordsAdapter(private val data: ArrayList<String>, val clickListener: (String, Int) -> Unit) :
    RecyclerView.Adapter<WordsAdapter.WordsViewHolder>() {
    var TAG = WordsAdapter::class.java.simpleName

    class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview: TextView
        init {
            textview = itemView.findViewById(R.id.tv_item)
            var TAG = WordsAdapter::class.java.simpleName

            Log.i(TAG, "WordsViewHolder")

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return WordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        holder.textview.text = data[position]
        holder?.textview?.setOnClickListener { clickListener(data[position], position) }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
