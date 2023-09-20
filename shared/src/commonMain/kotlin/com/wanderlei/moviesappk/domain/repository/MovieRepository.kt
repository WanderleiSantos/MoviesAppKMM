package com.wanderlei.moviesappk.domain.repository

import com.wanderlei.moviesappk.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>
    suspend fun getMovie(movieId: Int): Movie
}