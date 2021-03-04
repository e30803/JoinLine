package com.iew.cstudio.joinline

import android.content.Context
import android.os.AsyncTask

/** Load Status callback interface */
interface LoadDataCallback {
    fun loaded()
    fun loadError()
}

class SplashLoadDataTask(private val callback: LoadDataCallback, val context: Context) : AsyncTask<Void?, Void?, Int>()
{
    override fun onPostExecute(status: Int) {
        super.onPostExecute(status)
        if (status == 0) {
            callback.loaded()
        } else if (status == 1) {
            callback.loadError()
        }
    }

    override fun doInBackground(vararg params: Void?): Int {

        return try {

            // do something of Splash  for example call thread sleep
            Thread.sleep(2000);
            0
        } catch (e: Exception) {
            1
        }
    }

}
