package com.example.kotlintask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(10)

        recycle_view.adapter = ExampleAdapter(exampleList)
        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.setHasFixedSize(true)
    }
    private fun generateDummyList(size: Int): List<Exampleitem> {

        val list = ArrayList<Exampleitem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.android
                1 -> R.drawable.mobile
                else -> R.drawable.ic_archive_black_24dp
            }
            val item = Exampleitem(drawable,"book $i","buy now")
            list += item
        }

        return list
    }
}
