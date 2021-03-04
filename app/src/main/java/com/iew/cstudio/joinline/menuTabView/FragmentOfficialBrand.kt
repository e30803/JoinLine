package com.iew.cstudio.joinline.menuTabView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IDrawerViewOnClick
import com.iew.cstudio.joinline.`interface`.IRCAdapterOnClick
import com.iew.cstudio.joinline.`interface`.IRCAdapterWithFunctionOnClick
import com.iew.cstudio.joinline.adapter.AdapterRCBrandProfile
import com.iew.cstudio.joinline.adapter.AdapterRCHistory2Column
import com.iew.cstudio.joinline.entity.ItemsBrandProfile
import com.iew.cstudio.joinline.entity.ItemsMainFunction
import kotlinx.android.synthetic.main.fragment_custom_brand.*
import kotlinx.android.synthetic.main.fragment_offical_brand.*
import kotlinx.android.synthetic.main.fragment_offical_brand.imageView
import kotlinx.android.synthetic.main.fragment_offical_brand.rcvBrandList
import kotlinx.android.synthetic.main.fragment_questionnaire_history.*


class FragmentOfficialBrand : Fragment(), IRCAdapterOnClick, IDrawerViewOnClick {

    private var  lstBrandProfiles: MutableList<ItemsBrandProfile> = mutableListOf()

    private var  lstBrandCategory: MutableList<String> = mutableListOf()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_offical_brand, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        lstBrandCategory.add("雞排類")
        lstBrandCategory.add("飲料類")
        lstBrandCategory.add("雞蛋糕")
        lstBrandCategory.add("類別 A")
        lstBrandCategory.add("類別 B")
        lstBrandCategory.add("類別 C")
        lstBrandCategory.add("類別 D")
        lstBrandCategory.add("類別 E")
        lstBrandCategory.add("類別 F")
        lstBrandCategory.add("類別 G")
        lstBrandCategory.add("類別 H")
        lstBrandCategory.add("類別 I")
        lstBrandCategory.add("類別 J")
        lstBrandCategory.add("類別 K")
        lstBrandCategory.add("類別 L")
        lstBrandCategory.add("類別 M")
        lstBrandCategory.add("類別 N")
        lstBrandCategory.add("類別 O")
        lstBrandCategory.add("類別 P")


        drawerView_comple.initCategory(lstBrandCategory,this)

        imageView.setOnClickListener { myDrawer.openDrawer(GravityCompat.START)}



            for(i in 1..100) {
            lstBrandProfiles.add(
                ItemsBrandProfile(
                    "官方測試$i",
                    null,
                    "https://firebasestorage.googleapis.com/v0/b/fun2order-e8fe9.appspot.com/o/Brand_Image%2F%E4%B8%8A%E5%AE%87%E6%9E%97.png?alt=media&token=d260b494-9bf6-4325-86f1-6c03a162ed44",
                    false
                )
            )
        }


        rcvBrandList!!.layoutManager =  GridLayoutManager(requireContext(), 5)
        rcvBrandList!!.adapter = AdapterRCBrandProfile( requireContext(), lstBrandProfiles , this)
        rcvBrandList!!.setHasFixedSize(true)
        rcvBrandList!!.setItemViewCacheSize(200)



    }


    override fun onDestroyView() {
        super.onDestroyView()

        drawerView_comple.onDestroy()
    }

    override fun onClick(sender: String, pos: Int, type: Int) {

        var abc =123

    }

    override fun onSelected(sender: String, selected: String) {
        var abc =123
    }


}