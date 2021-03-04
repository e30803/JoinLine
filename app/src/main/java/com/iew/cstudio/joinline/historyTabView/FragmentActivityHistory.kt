package com.iew.cstudio.joinline.historyTabView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IRCAdapterWithFunctionOnClick
import com.iew.cstudio.joinline.adapter.AdapterRCHistory2Column
import com.iew.cstudio.joinline.entity.ItemsMainFunction
import kotlinx.android.synthetic.main.fragment_questionnaire_history.*


class FragmentActivityHistory : Fragment(), IRCAdapterWithFunctionOnClick {

    var activityHistoryList : MutableList<ItemsMainFunction> = mutableListOf()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_activity_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activityHistoryList.add(ItemsMainFunction("揪活動1", "activity","Function_Menu"))
        activityHistoryList.add(ItemsMainFunction("揪活動2", "activity","Function_Menu"))
        activityHistoryList.add(ItemsMainFunction("揪活動3", "activity","Function_Menu"))
        activityHistoryList.add(ItemsMainFunction("揪活動4", "activity","Function_Menu"))
        activityHistoryList.add(ItemsMainFunction("揪活動5", "activity","Function_Menu"))
        activityHistoryList.add(ItemsMainFunction("揪活動6", "activity","Function_Menu"))


        rcvHistory!!.layoutManager =  GridLayoutManager(requireContext(), 1)
        rcvHistory!!.adapter = AdapterRCHistory2Column( requireContext(), activityHistoryList , this)
        rcvHistory!!.setItemViewCacheSize(200)

    }

    override fun onClick(sender: String, pos: Int, type: Int, function: String) {

    }
}