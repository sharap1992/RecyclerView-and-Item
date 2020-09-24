package com.example.lesson14recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter: ListAdapter = ListAdapter(this)
    private var number: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.adapter = adapter
        recyclerview.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)
        recyclerview.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        setAl()
    }
    fun setAl() {
        val models: MutableList<User> = mutableListOf()
        val model: User = User()
        model.name1 = "Title 1"
        model.name2 = "Description 1"
        model.count = 1
        models.add(model)
        adapter.setData(models)
    }

    private fun setAl2(user: User) {
        val models: MutableList<User> = mutableListOf()
        for (i in 1 .. number+user.count) {
            val model: User = User()
            model.name1 = "Title $i"
            model.name2 = "Description $i"
            model.count = i
            number = i
            models.add(model)
        }
        adapter.setData(models)
    }


    fun onItemClicked(user: User) {
        setAl2(user)

     }
}