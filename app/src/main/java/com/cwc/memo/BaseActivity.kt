package com.cwc.memo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Cui on 2017/8/13.
 * @Description
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.fitsSystemWindows = getFitSystemWindow()
    }

    fun getFitSystemWindow() : Boolean {
        return true
    }
}