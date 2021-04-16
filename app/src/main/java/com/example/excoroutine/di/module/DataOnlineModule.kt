package com.example.excoroutine.di.module

import com.example.excoroutine.service.PachinkoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
class DataOnlineModule {

    @Provides
    fun providePachinkoService(retrofit: Retrofit): PachinkoService{
        return retrofit.create(PachinkoService::class.java)
    }
}