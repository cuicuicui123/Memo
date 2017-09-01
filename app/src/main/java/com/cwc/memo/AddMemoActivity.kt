package com.cwc.memo

import android.app.TimePickerDialog
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_memo.*
import java.util.*

class AddMemoActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_memo)
        btn_select_date.setOnClickListener { selectDate() }
        btn_select_time.setOnClickListener { selectTime() }
    }

    fun selectDate() {
        val dialogFragment = DatePickerDialogFragment.newInstance()
        dialogFragment.show(supportFragmentManager, "")
        dialogFragment.isCancelable
        dialogFragment.setDatePickerListener(object : DatePickerDialogFragment.OnDateChangeListener {
            override fun onDateChanger(year: Int, month: Int, day: Int) {
                showDate(year, month + 1, day)
            }
        })
    }

    fun selectTime() {
        val calendar = Calendar.getInstance()
        TimePickerDialog(this, { _, hourOfDay, minute -> showTime(hourOfDay, minute) }, calendar[Calendar.HOUR],
                calendar[Calendar.MINUTE], true).show()
    }

    fun showTime(hour: Int, minute: Int) {
        tv_time.text = "${getStringText(hour)}:${getStringText(minute)}"
    }

    fun showDate(year: Int, month: Int, day: Int) {
        tv_date.text = "$year 年${getStringText(month)}月${getStringText(day)}日"
    }

    fun getStringText(num: Int): String = if (num >= 10) num.toString() else "0$num"
}
