package com.cwc.memo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.util.*

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
        var model = data[position]
        myViewHolder.contentTv.text = String.format(Locale.CHINA, "地点：%s", model.content)
        myViewHolder.titleTv.text = model.title
        myViewHolder.dateTv.text = model.date
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false))
    }

    class MyViewHolder : RecyclerView.ViewHolder {
        var iv : ImageView
        var titleTv : TextView
        var contentTv : TextView
        var dateTv: TextView
        constructor(itemView: View) : super(itemView) {
            iv = itemView.findViewById(R.id.iv) as ImageView
            titleTv = itemView.findViewById(R.id.tv_title) as TextView
            contentTv = itemView.findViewById(R.id.tv_content) as TextView
            dateTv = itemView.findViewById(R.id.tv_date_time) as TextView
        }
    }
}