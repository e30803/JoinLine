package com.iew.cstudio.joinline.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iew.cstudio.joinline.MainActivity
import com.iew.cstudio.joinline.R
import kotlinx.android.synthetic.main.activity_s_m_s_verify.*

class SMSVerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_m_s_verify)
        supportActionBar?.hide()

        btnSubmitOTP.setOnClickListener {

            val intent = Intent()
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.setClass(this, MainActivity::class.java!!)
            startActivity(intent)
            finish()
        }
    }
}