package com.androrubin.messmavendemo.ui.home

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import com.androrubin.messmavendemo.R
import java.util.Calendar

class mess_leave_calenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess_leave_calender)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)

        val clickBtn=findViewById<Button>(R.id.click_btn)
        val textview=findViewById<TextView>(R.id.dateTv)
        clickBtn.setOnClickListener {
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, myear, mmonth, mdayOfMonth ->
                textview.setText(""+mdayOfMonth+"/"+mmonth+"/"+myear)
            }, year, month, day)
            dpd.show()
        }
    }


}