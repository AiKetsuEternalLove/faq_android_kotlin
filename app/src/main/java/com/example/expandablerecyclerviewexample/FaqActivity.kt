package com.example.expandablerecyclerviewexample

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.faq_activity.*


class FaqActivity : AppCompatActivity() {
    var itemsData = ArrayList<DataModel>()
    lateinit var adapter: RVAdapter
    lateinit var mcontext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.faq_activity)
        mcontext = this.baseContext

        adapter = RVAdapter(itemsData)
        val llm = LinearLayoutManager(this)

        itemsrv.setHasFixedSize(true)
        itemsrv.layoutManager = llm
        getData()
        itemsrv.adapter = adapter
    }

    private fun getData() {
        itemsData = ArrayList()
        itemsData = FaqModel.items
        adapter.notifyDataSetChanged()
        adapter = RVAdapter(itemsData)
    }
}
