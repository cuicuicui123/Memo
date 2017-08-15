package com.cwc.memo

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        var list = ArrayList<Model>()
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        var adapter = RecyclerViewAdapter(list, this)
        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.layoutManager = layoutManager
        recycler_view.addItemDecoration(DividerItemDecoration(this))
        recycler_view.adapter = adapter
    }
}
