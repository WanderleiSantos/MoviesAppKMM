package com.wanderlei.moviesappk.android

import android.app.Application
import com.wanderlei.moviesappk.android.di.appModule
import com.wanderlei.moviesappk.di.getSharedModules
import org.koin.core.context.startKoin

class Movie : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin { modules(appModule + getSharedModules()) }
    }
}