package com.iew.cstudio.joinline.unility

import androidx.recyclerview.widget.RecyclerView

fun <T : RecyclerView.ViewHolder> T.listen(event: (position: Int, type: Int) -> Unit): T {
    itemView.setOnClickListener {
        event.invoke(adapterPosition, 0)
    }

    itemView.setOnLongClickListener {
        event.invoke(adapterPosition, 1)
        true
    }

    return this
}