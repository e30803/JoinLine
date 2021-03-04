package com.iew.cstudio.joinline.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.iew.cstudio.joinline.R
import com.iew.cstudio.joinline.`interface`.IRCAdapterOnClick
import com.iew.cstudio.joinline.entity.ItemsBrandProfile
import com.iew.cstudio.joinline.unility.listen
import kotlinx.android.synthetic.main.row_shop_branditem.view.*

class AdapterRCBrandProfile(var context: Context, var lstBrandItemProfile: List<ItemsBrandProfile>, private val IAdapterOnClick: IRCAdapterOnClick) : RecyclerView.Adapter<AdapterRCBrandProfile.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // 指定了 layout
        val view = LayoutInflater.from(context).inflate(R.layout.row_shop_branditem,  null)
        return ViewHolder(view).listen()
        { pos, type ->
            IAdapterOnClick.onClick("Brand",pos,type)
        }
    }

    override fun getItemCount(): Int {
        return lstBrandItemProfile.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindModel( lstBrandItemProfile[position] )
    }

    // view
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var requestOptions = RequestOptions()

        fun bindModel(Items: ItemsBrandProfile) {
            itemView.BrandName.text = Items.Name
           // itemView.BrandView.setImageBitmap(null)
            requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(30))

            Glide.with(context)
                .load(Items.ImageURL)
                .apply(requestOptions)
                .error(null)
                .into(itemView.BrandView)

        }
    }


}
