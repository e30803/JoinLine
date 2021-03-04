package com.iew.cstudio.joinline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.login.LoginPhoneActivity

class SplashActivity : AppCompatActivity(), LoadDataCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()

        // 启动加载应用数据任务类
        val task = SplashLoadDataTask(this, this)
        task.execute()
    }

    /** 跳轉介面到下一個畫面去 **/
    private fun jump() {
        Handler().postDelayed({
            // 此處可以根據Login Status 判斷跳轉畫面
            val newIntent = Intent()
            newIntent.setClass(this, LoginPhoneActivity::class.java)
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            if (intent.extras != null) {
                newIntent.putExtras(intent!!.extras!!)   // 如果有帶入Notification Info 就帶進去Main畫面處理
            } else {
                newIntent.putExtras(Bundle())            //沒有就帶空的值進去
            }
            startActivity(newIntent)
            finish()
        }, 500) // 停留时间500ms
    }

    override fun loaded() {
        jump()
    }
    override fun loadError() {
        // 进行出错处理
        // ...
        jump()
    }

    override fun onBackPressed() {
        // override this function make sure Splash form can't be BackPressed
    }
}