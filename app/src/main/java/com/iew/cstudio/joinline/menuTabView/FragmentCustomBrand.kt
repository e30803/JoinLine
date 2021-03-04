package com.iew.cstudio.joinline.menuTabView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IRCAdapterOnClick
import com.iew.cstudio.joinline.`interface`.IRCAdapterWithFunctionOnClick
import com.iew.cstudio.joinline.adapter.AdapterRCBrandProfile
import com.iew.cstudio.joinline.entity.ItemsBrandProfile
import kotlinx.android.synthetic.main.fragment_custom_brand.*
import kotlinx.android.synthetic.main.fragment_questionnaire_history.*

class FragmentCustomBrand : Fragment(), IRCAdapterOnClick {


    private var  lstBrandProfiles: MutableList<ItemsBrandProfile> = mutableListOf()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_custom_brand, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        for(i in 1..100) {
            lstBrandProfiles.add(
                ItemsBrandProfile(
                    "品牌測試$i",
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

    override fun onClick(sender: String, pos: Int, type: Int) {

    }


}