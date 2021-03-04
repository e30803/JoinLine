package com.iew.cstudio.joinline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        title = getString(R.string.UI_OtherFunction_Function_Setting)
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.hide()
    }
}