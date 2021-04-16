package com.example.data

import android.util.Log
import javax.inject.Inject

class DataManagerImpl @Inject constructor(): DataManager {
    override fun fetchData(id: Int) {
        Log.d("fetch data of: ", id.toString())
    }
}