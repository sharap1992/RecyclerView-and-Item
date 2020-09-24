package com.example.lesson14recyclerview


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val tvTitle: TextView = itemView.Name
    private val tvDescription: TextView = itemView.Surname

    fun populateModel(sss: User, activity: MainActivity) {
        tvTitle.text = sss.name1
        tvDescription.text = sss.name2
        itemView.setOnClickListener {
            activity.onItemClicked(sss)
        }
    }
}
