package com.iew.cstudio.joinline.historyTabView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IRCAdapterWithFunctionOnClick
import com.iew.cstudio.joinline.adapter.AdapterRCHistory2Column
import com.iew.cstudio.joinline.entity.ItemsMainFunction
import kotlinx.android.synthetic.main.fragment_order_history.*


class FragmentOrderHistory : Fragment() , IRCAdapterWithFunctionOnClick {

    var orderHistoryList : MutableList<ItemsMainFunction> = mutableListOf()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_order_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))


        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))


        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))


        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))


        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))


        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))

        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Menu), "icon_menu","Function_Menu"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Activity), "icon_activity","Function_Activity"))
        orderHistoryList.add(ItemsMainFunction(getString(R.string.UI_MainFunction_Function_Questionnaire), "icon_questionnaire","Function_Questionnaire"))

        rcvHistory!!.layoutManager =  GridLayoutManager(requireContext(), 2)
        rcvHistory!!.adapter = AdapterRCHistory2Column( requireContext(), orderHistoryList , this)
        rcvHistory!!.setItemViewCacheSize(200)

    }

    override fun onClick(sender: String, pos: Int, type: Int, function: String) {



    }




}