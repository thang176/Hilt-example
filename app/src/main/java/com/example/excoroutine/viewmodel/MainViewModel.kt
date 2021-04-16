package com.example.excoroutine.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.data.DataManager
import com.example.excoroutine.service.PachinkoService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val pachinkoService: PachinkoService,
    val dataManager: DataManager
    ): ViewModel() {

    fun getShop(){
        CoroutineScope(Dispatchers.IO).launch {
            val response = pachinkoService.getShopTop(13)

            if (response.isSuccessful){
                response.body()?.let {

                    for (item in it){
                        item.dedamaFlag?.let {check ->
                            if(check){
                                item.shopName?.let { it1 -> Log.v("name: ", it1) }
                            }
                        }
                    }
                }
            }
        }
    }

    fun fetchData(id: Int){
        dataManager.fetchData(id)
    }
}