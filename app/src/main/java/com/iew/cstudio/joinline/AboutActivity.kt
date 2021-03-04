package com.iew.cstudio.joinline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.hide()


        textAboutViewVersion.text = BuildConfig.VERSION_NAME

        //------ Load Image From Drawable -----
        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(30))
        Glide.with(this)
            .load( R.drawable.appstore_icon_without_alpha)
            .apply(requestOptions)
            .error(null)
            .into(imageViewAboutUs)

    }
}