package com.cwc.memo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by Cui on 2017/8/15.
 * @Description
 */
class DividerItemDecoration(context : Context) : RecyclerView.ItemDecoration() {
    var divider: Drawable = context.resources.getDrawable(R.drawable.divider)

    override fun onDrawOver(c: Canvas?, parent: RecyclerView?, state: RecyclerView.State?) {
        if (c != null && parent != null) {
            drawHorizontalLine(c, parent)
        }
    }

    fun drawHorizontalLine(c: Canvas, parent: RecyclerView){
        val left = parent.paddingLeft
        val right = parent.width - parent.paddingRight
        val childCount = parent.childCount
        (0 .. childCount)
                .map { parent.getChildAt(it) }
                .forEach {
                    it?.let {
                        val params = it.layoutParams as RecyclerView.LayoutParams
                        val top = it.bottom + params.bottomMargin
                        val bottom = top + divider.intrinsicHeight
                        divider.bounds = Rect(left, top, right, bottom)
                        divider.draw(c)
                    }
                }
    }

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        outRect?.set(0, 0, 0, divider.intrinsicHeight)
    }

}