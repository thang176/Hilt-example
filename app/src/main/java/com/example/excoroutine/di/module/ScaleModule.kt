package com.example.excoroutine.di.module

import com.example.excoroutine.service.ScaleService
import com.example.excoroutine.service.ScaleServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ScaleModule {

    @Binds
    abstract fun bindScaleService(scaleServiceImpl: ScaleServiceImpl): ScaleService
}