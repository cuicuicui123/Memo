package com.cwc.memo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Cui on 2017/8/13.
 * @Description
 */
class RecyclerViewAdapter(list: ArrayList<Model>, context : Context) : BaseRecyclerViewAdapter() {
    var data = list
    var context = context

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        var myViewHolder = holder as MyViewHolder
        myViewHolder.contentTv!!.text = "标题"

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        Log.i("tag", "tag")
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item, null))
    }

    class MyViewHolder : RecyclerView.ViewHolder {
        var iv : ImageView?= null
        var titleTv : TextView?= null
        var contentTv : TextView?= null
        constructor(itemView: View) : super(itemView) {
            iv = itemView.findViewById(R.id.iv) as ImageView?
            titleTv = itemView.findViewById(R.id.tv_title) as TextView?
            contentTv = itemView.findViewById(R.id.tv_content) as TextView?
        }
    }
}