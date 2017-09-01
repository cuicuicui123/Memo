package com.cwc.memo

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder

/**
 * Created by Cui on 2017/8/13.
 * @Description
 */
abstract class BaseRecyclerViewAdapter : RecyclerView.Adapter<ViewHolder>() {

    fun setOnCLickListener(onItemClickListener: (BaseRecyclerViewAdapter) -> Unit){

    }

}