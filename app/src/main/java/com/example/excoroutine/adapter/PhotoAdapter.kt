package com.example.excoroutine.adapter

import com.example.excoroutine.service.ScaleService
import javax.inject.Inject

class PhotoAdapter @Inject constructor(val scaleService: ScaleService) {

    fun create(){
        scaleService.scale("Photo adapter");
    }
}