package com.wanderlei.moviesappk.data.repository

import com.wanderlei.moviesappk.data.remote.RemoteDataSource
import com.wanderlei.moviesappk.data.util.toMovie
import com.wanderlei.moviesappk.domain.model.Movie
import com.wanderlei.moviesappk.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }
}