package com.iew.cstudio.joinline.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IRCAdapterWithFunctionOnClick
import com.iew.cstudio.joinline.entity.ItemsMainFunction
import com.iew.cstudio.joinline.unility.listen
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.row_history_unit.view.*


class AdapterRCHistory2Column(var context: Context, var lstFunctionItems: List<ItemsMainFunction>, private val iAdapterOnClick: IRCAdapterWithFunctionOnClick) : RecyclerView.Adapter<AdapterRCHistory2Column.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // 指定了 layout
        val view = LayoutInflater.from(context).inflate(R.layout.row_history_unit,  parent,false)
        return ViewHolder(view)
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
            //itemView.imgFunctionView.setImageDrawable(getImageDrawable(FunctionItem.iconName))
            itemView.txtOrderTitle.text  = FunctionItem.functionName

            //------ Load Image From Drawable -----
            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(30))
            Glide.with(context)
                .load( R.drawable.activity)
                .apply(requestOptions)
                .error(null)
                .into(itemView.imgHistoryBG)

            itemView.imgOrderEdit.setOnClickListener {
                iAdapterOnClick.onClick(FunctionItem.functionName, adapterPosition, 0,"orderEdit")
            }

            itemView.imgOrderStatistics.setOnClickListener {
                iAdapterOnClick.onClick(FunctionItem.functionName, adapterPosition, 0,"orderStatistics")
            }

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








