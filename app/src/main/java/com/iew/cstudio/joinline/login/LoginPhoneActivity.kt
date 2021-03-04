package com.iew.cstudio.joinline.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.appcompat.app.AlertDialog
import com.hbb20.CountryCodePicker
import com.iew.cstudio.joinline.R
import kotlinx.android.synthetic.main.activity_login_phone.*

class LoginPhoneActivity : AppCompatActivity(),CountryCodePicker.OnCountryChangeListener {

    private var ccp: CountryCodePicker?=null
    private var countryCode:String?=null
    private var countryName:String?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_phone)
        supportActionBar?.hide()

        ccp = findViewById(R.id.country_code_picker)
        ccp!!.setOnCountryChangeListener(this)
        ccp!!.setAutoDetectedCountry(true)
        ccp!!.registerCarrierNumberEditText(editTextPhoneNumber)

        loginPhoneNEXT.setOnClickListener()
        {
            val phoneValid = ccp!!.isValidFullNumber
            if (phoneValid)
            {
                val intent = Intent()
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.setClass(this, SMSVerifyActivity::class.java!!)
                val bundle = Bundle()
                bundle.putString("VerifyPhoneNo", ccp!!.fullNumberWithPlus)
                intent.putExtras(bundle)
                startActivity(intent)
                finish()
            }
            else
            {
                val notifyAlert = AlertDialog.Builder(ContextThemeWrapper(this, R.style.AlertDialogTheme)).create()
                notifyAlert.setTitle(getString(R.string.UI_IllegalPhoneNumber))
                notifyAlert.setMessage(getString(R.string.UI_IllegalPhoneNumberDetail))
                notifyAlert.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { _, i -> }
                notifyAlert.show()
            }

        }

    }

    override fun onCountrySelected() {
        countryCode=ccp!!.selectedCountryCode
        countryName=ccp!!.selectedCountryName
    }
}