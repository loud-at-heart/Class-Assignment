package com.example.classassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordsAdapterCalc(
    private val data: ArrayList<String>,
    val clickListener: (String, Int) -> Unit
) :
    RecyclerView.Adapter<WordsAdapterCalc.WordsViewHolder>() {
    class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview: TextView = itemView.findViewById(R.id.history)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_layout_calc, parent, false)
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
