package com.wanderlei.moviesappk.android.di

import com.wanderlei.moviesappk.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module { viewModel { HomeViewModel(get()) } }