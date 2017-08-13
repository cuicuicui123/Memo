package com.cwc.memo

import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        var list = ArrayList<Model>()
        list.add(Model())
        list.add(Model())
        Log.i("tag", list.size.toString())
        var adapter = RecyclerViewAdapter(list, this)
        Log.i("tag", adapter.itemCount.toString())
        recycler_view.adapter = adapter
    }
}
