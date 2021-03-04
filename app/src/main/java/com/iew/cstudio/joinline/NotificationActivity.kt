package com.iew.cstudio.joinline

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.RadioButton
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.row_notification_expansion.view.*

class NotificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        title = getString(R.string.UI_OtherFunction_Function_Notification)
        supportActionBar?.hide()

        for(i in 0..10){
            val notificationCell =
                LayoutInflater.from(this).inflate(R.layout.row_notification_expansion, null)
            notificationCell.txtNotifyTitle.text = "這個是測試" + i.toString()
            notificationCell.txtNotifyTimeStamp.text = "20210126"
            notificationCell.txtNotifyDesc.text =
                "這個是極限測試122223334444555666778899gji gjijgjiojgiojgo jogijogigjojgojo jdgojsodjgojdsog"
            root.addView(notificationCell)

        }


    }
}