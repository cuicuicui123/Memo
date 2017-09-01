package com.cwc.memo

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import java.util.*

/**
 * @author Cuiweicong 2017/9/1
 */

class DatePickerDialogFragment : DialogFragment() {
    var onDateChangeListener: OnDateChangeListener? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.dialog_date_picker, container, false)
        val datePicker = view.findViewById(R.id.date_picker) as DatePicker
        val calendar = Calendar.getInstance()
        datePicker.init(calendar[Calendar.YEAR], calendar[Calendar.MONTH], calendar[Calendar.DAY_OF_MONTH], null)
        view.findViewById(R.id.tv_cancel).setOnClickListener { dismiss() }
        view.findViewById(R.id.tv_sure).setOnClickListener {
            onDateChangeListener?.onDateChanger(datePicker.year, datePicker.month, datePicker.dayOfMonth)
            dismiss()
        }
        return view
    }

    fun setDatePickerListener(onDateChangeListener: OnDateChangeListener) {
        this.onDateChangeListener = onDateChangeListener
    }

    interface OnDateChangeListener {
        fun onDateChanger(year: Int, month: Int, day: Int)
    }

    companion object {
        fun newInstance(): DatePickerDialogFragment {
            return DatePickerDialogFragment()
        }
    }

}
