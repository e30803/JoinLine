package com.iew.cstudio.joinline



import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.iew.cstudio.joinline.`interface`.IDrawerViewOnClick
import com.iew.cstudio.joinline.`interface`.IRCAdapterOnClick
import com.iew.cstudio.joinline.entity.ItemsBrandProfile
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.row_drawerview_items.view.*
import kotlinx.android.synthetic.main.row_notification_expansion.view.*
import kotlinx.android.synthetic.main.view_drawer.view.*

class DrawerView : LinearLayout {

    private var mContext: Context? = null
    private var isShow = false  //false 表示隐藏


    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.view_drawer, this)
        mContext = context

    }



    public fun initCategory(lstBrandItemProfile: List<String>, ISelect: IDrawerViewOnClick) {



        val drawerSection = LayoutInflater.from(context).inflate(R.layout.row_drawerview_section, null)
        drawerSection.txtItemName.text = "品牌分類"
        drawerSection.setOnClickListener {
            (parent as androidx.drawerlayout.widget.DrawerLayout).closeDrawers()
        }
        layoutView.addView(drawerSection)


        lstBrandItemProfile.forEach()
        { it ->
            val drawerCell = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
            drawerCell.txtItemName.text = it.toString()

            drawerCell.setOnClickListener {
                ISelect.onSelected("", it.txtItemName.text.toString())
                (parent as androidx.drawerlayout.widget.DrawerLayout).closeDrawers()
            }
            layoutView.addView(drawerCell)

        }


/*
        val drawerCell1 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell1.txtItemName.text = "茶飲類1234567890"
        layoutView.addView(drawerCell1)

        val drawerCell2 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell2.txtItemName.text = "便當類"
        layoutView.addView(drawerCell2)

        val drawerCell3 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell3.txtItemName.text = "雞排類"
        layoutView.addView(drawerCell3)


        val drawerCell4 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell4.txtItemName.text = "茶飲類"
        layoutView.addView(drawerCell4)

        val drawerCell5 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell5.txtItemName.text = "便當類"
        layoutView.addView(drawerCell5)

        val drawerCell6 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell6.txtItemName.text = "雞排類"
        layoutView.addView(drawerCell6)

        val drawerCell7 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell7.txtItemName.text = "茶飲類"
        layoutView.addView(drawerCell7)

        val drawerCell8 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell8.txtItemName.text = "便當類"
        layoutView.addView(drawerCell8)

        val drawerCell9 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell9.txtItemName.text = "雞排類"
        layoutView.addView(drawerCell9)


        val drawerCell10 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell10.txtItemName.text = "茶飲類"
        layoutView.addView(drawerCell10)

        val drawerCell11 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell11.txtItemName.text = "便當類"
        layoutView.addView(drawerCell11)

        val drawerCell12 = LayoutInflater.from(context).inflate(R.layout.row_drawerview_items, null)
        drawerCell12.txtItemName.text = "雞排類"
        layoutView.addView(drawerCell12)

*/

        /*
        val valueTV = TextView(context)
        valueTV.text = "hallo hallo"

        valueTV.layoutParams = LayoutParams(
            LayoutParams.FILL_PARENT,
            LayoutParams.WRAP_CONTENT
        )
        valueTV.setOnClickListener {
            val hval = "Heool0"
            (parent as androidx.drawerlayout.widget.DrawerLayout).closeDrawers()
        }
        layoutView.addView(valueTV)
      */


    }


    fun onDestroy() {

    }
}