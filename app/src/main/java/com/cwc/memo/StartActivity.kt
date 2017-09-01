package com.cwc.memo

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : BaseActivity() {
    var a = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val list = getList()
        val adapter = RecyclerViewAdapter(list, this)
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recycler_view.adapter = adapter
        recycler_view.layoutManager = layoutManager
        recycler_view.addItemDecoration(DividerItemDecoration(this))
        recycler_view.setOnClickListener { sum(1) }
        adapter.setOnCLickListener{ sum(1) }
        fab.setOnClickListener {
            val intent = Intent(this, AddMemoActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getList(): ArrayList<Model> {
        var list = ArrayList<Model>()
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "打篮球", "回龙观体育公园", "8月16日"))
        list.add(Model("", "出去玩", "天安门", "8月17日"))
        list.add(Model("", "吃饭", "打游戏啊", "8月28日"))
        list.add(Model("", "", "", ""))
        return list
    }

    fun sum(position : Int){
        a ++
    }

}
