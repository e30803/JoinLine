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


class FragmentQuestionnaireHistory : Fragment() , IRCAdapterWithFunctionOnClick {

    var questionHistoryList : MutableList<ItemsMainFunction> = mutableListOf()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_questionnaire_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionHistoryList.add(ItemsMainFunction("揪問卷1", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷2", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷3", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷4", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷5", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷6", "icon_menu","Function_Menu"))

        questionHistoryList.add(ItemsMainFunction("揪問卷7", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷8", "icon_menu","Function_Menu"))
        questionHistoryList.add(ItemsMainFunction("揪問卷9", "icon_menu","Function_Menu"))


        rcvHistory!!.layoutManager =  GridLayoutManager(requireContext(), 2)
        rcvHistory!!.adapter = AdapterRCHistory2Column( requireContext(), questionHistoryList , this)
        rcvHistory!!.setItemViewCacheSize(200)

    }

    override fun onClick(sender: String, pos: Int, type: Int, function: String) {

    }

}