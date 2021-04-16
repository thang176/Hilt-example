package com.example.excoroutine.ui

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.excoroutine.R
import com.example.excoroutine.adapter.PhotoAdapter
import com.example.excoroutine.di.module.User
import com.example.excoroutine.service.ScaleService
import com.example.excoroutine.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject lateinit var photoAdapter: PhotoAdapter

    val mainViewModel: MainViewModel by viewModels()

    @Inject lateinit var scaleService: ScaleService

    @User
    @Inject lateinit var set: Set<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userAgent: String = System.getProperty("http.agent")?:"empty"
        Log.d("User agent: ", userAgent)
        Log.d("User agent: ", getUserAgent())

//        photoAdapter.create()
//
//        scaleService.scale("hello world")
//
//        mainViewModel.getShop();
//
//        mainViewModel.fetchData(16)
//
//        Log.d("User: ", set.toString())

    }

    fun getUserAgent(): String{
        val result = StringBuilder(64)
        result.append("Dalvik/")
        result.append(System.getProperty("java.vm.version")) // such as 1.1.0

        result.append(" (Linux; U; Android ")

        val version = Build.VERSION.RELEASE // "1.0" or "3.4b5"

        result.append(if (version.length > 0) version else "1.0")

        // add the model for the release build

        // add the model for the release build
        if ("REL" == Build.VERSION.CODENAME) {
            val model = Build.MODEL
            if (model.length > 0) {
                result.append("; ")
                result.append(model)
            }
        }
        val id = Build.ID // "MASTER" or "M4-rc20"

        if (id.length > 0) {
            result.append(" Build/")
            result.append(id)
        }
        result.append(")")
        return result.toString()
    }
}