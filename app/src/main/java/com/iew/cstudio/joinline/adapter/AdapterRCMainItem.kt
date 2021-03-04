package com.iew.cstudio.joinline.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IRCAdapterOnClick
import com.iew.cstudio.joinline.entity.ItemsMainFunction
import com.iew.cstudio.joinline.unility.listen
import kotlinx.android.synthetic.main.row_main_functions.view.*

class AdapterRCMainItem(var context: Context, var lstFunctionItems: List<ItemsMainFunction>, private val iAdapterOnClick: IRCAdapterOnClick) : RecyclerView.Adapter<AdapterRCMainItem.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // 指定了 layout
        val view = LayoutInflater.from(context).inflate(R.layout.row_main_functions,  null)
        return ViewHolder(view).listen()
        { pos, type ->

            var functionKey = lstFunctionItems[pos].functionKey ?: ""
            iAdapterOnClick.onClick(functionKey, pos, type)
        }
    }

    override fun getItemCount(): Int {
        return lstFunctionItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindModel( lstFunctionItems[position] )
    }

    // view
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindModel(FunctionItem: ItemsMainFunction) {
            itemView.imgFunctionView.setImageDrawable(getImageDrawable(FunctionItem.iconName))
            itemView.txtFunctionName.text  = FunctionItem.functionName
        }

        private fun getImageDrawable(imageName: String): Drawable? {
            val id = context.resources.getIdentifier(imageName, "drawable", context.packageName)

            return if(id != 0) {
                context.resources.getDrawable(id)
            } else
                null
        }
    }
}








