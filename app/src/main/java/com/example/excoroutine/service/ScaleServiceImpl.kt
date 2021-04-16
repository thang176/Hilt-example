package com.example.excoroutine.service

import android.util.Log
import javax.inject.Inject

class ScaleServiceImpl @Inject constructor(): ScaleService{
    override fun scale(msg: String) {
        Log.d("scale service : ", msg)
    }
}