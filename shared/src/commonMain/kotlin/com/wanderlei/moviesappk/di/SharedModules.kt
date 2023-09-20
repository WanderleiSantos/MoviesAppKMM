package com.wanderlei.moviesappk.di

import com.wanderlei.moviesappk.data.remote.MovieService
import com.wanderlei.moviesappk.data.remote.RemoteDataSource
import com.wanderlei.moviesappk.data.repository.MovieRepositoryImpl
import com.wanderlei.moviesappk.domain.repository.MovieRepository
import com.wanderlei.moviesappk.domain.usecase.GetMovieUseCase
import com.wanderlei.moviesappk.domain.usecase.GetMoviesUseCase
import com.wanderlei.moviesappk.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules