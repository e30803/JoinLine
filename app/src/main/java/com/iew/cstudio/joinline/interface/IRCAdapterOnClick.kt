package com.iew.cstudio.joinline.`interface`

interface IRCAdapterOnClick {
    fun onClick(sender: String, pos:Int, type:Int)
}

interface IRCAdapterWithFunctionOnClick {
    fun onClick(sender: String, pos:Int, type:Int, function:String)
}