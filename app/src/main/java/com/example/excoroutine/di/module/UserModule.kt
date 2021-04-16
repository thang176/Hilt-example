package com.example.excoroutine.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityComponent::class)
class UserModule {

    @User
    @Provides
    @IntoSet
    fun provideStringUser(): String{
        return "User"
    }

    @User
    @Provides
    @IntoSet
    fun provideStringNews(): String{
        return "News"
    }
}