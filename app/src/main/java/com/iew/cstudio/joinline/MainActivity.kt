package com.iew.cstudio.joinline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.GridLayoutManager
import com.iew.cstudio.joinline.`interface`.IRCAdapterOnClick
import com.iew.cstudio.joinline.adapter.AdapterRCMainItem
import com.iew.cstudio.joinline.entity.ItemsMainFunction
import com.iew.cstudio.joinline.login.LoginPhoneActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IRCAdapterOnClick {

    private val  numberOfColumns = 3
    private var  mainFunctions: MutableList<ItemsMainFunction> = mutableListOf()
    private var  otherFunctions: MutableList<ItemsMainFunction> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        mainFunctions.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        mainFunctions.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        mainFunctions.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))


        rcvMainFunctionItems!!.layoutManager =  GridLayoutManager(this, numberOfColumns)
        rcvMainFunctionItems!!.adapter = AdapterRCMainItem( this, mainFunctions , this)
        rcvMainFunctionItems!!.setHasFixedSize(true)
        rcvMainFunctionItems!!.setItemViewCacheSize(200)


        otherFunctions.add(ItemsMainFunction(getString(R.string.UI_OtherFunction_Function_Notification), "icon_notification","Function_Notification"))
        otherFunctions.add(ItemsMainFunction(getString(R.string.UI_OtherFunction_Function_History), "icon_history","Function_History"))
        otherFunctions.add(ItemsMainFunction(getString(R.string.UI_OtherFunction_Function_Setting), "icon_settings","Function_Setting"))
        otherFunctions.add(ItemsMainFunction(getString(R.string.UI_OtherFunction_Function_About), "icon_info","Function_About"))

        rcvOtherFunctionItems!!.layoutManager =  GridLayoutManager(this, numberOfColumns)
        rcvOtherFunctionItems!!.adapter = AdapterRCMainItem( this, otherFunctions , this)
        rcvOtherFunctionItems!!.setHasFixedSize(true)
        rcvOtherFunctionItems!!.setItemViewCacheSize(200)

    }

    override fun onClick(sender: String, pos: Int, type: Int) {

        when(sender.toString())
        {

            "Function_Menu" ->
            {
                val newIntent = Intent()
                newIntent.setClass(this, EditMenuActivity::class.java)
                startActivity(newIntent)

            }
            "Function_About" ->
            {
                val newIntent = Intent()
                newIntent.setClass(this, AboutActivity::class.java)
                startActivity(newIntent)

            }

            "Function_Setting" ->
            {
                val newIntent = Intent()
                newIntent.setClass(this, SettingActivity::class.java)
                startActivity(newIntent)

            }


            "Function_Notification" ->
            {
                val newIntent = Intent()
                newIntent.setClass(this, NotificationActivity::class.java)
                startActivity(newIntent)

            }

            "Function_History" ->
            {
                val newIntent = Intent()
                newIntent.setClass(this, HistoryActivity::class.java)
                startActivity(newIntent)

            }

        }


        /*
        val notifyAlert = AlertDialog.Builder(ContextThemeWrapper(this, R.style.AlertDialogTheme)).create()

        notifyAlert.setMessage(sender.toString())
        notifyAlert.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _, i -> }
        notifyAlert.show()*/





    }
}