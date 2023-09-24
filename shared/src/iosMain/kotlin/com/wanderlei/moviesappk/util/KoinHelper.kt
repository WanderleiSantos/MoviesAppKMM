package com.wanderlei.moviesappk.util

import com.wanderlei.moviesappk.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}