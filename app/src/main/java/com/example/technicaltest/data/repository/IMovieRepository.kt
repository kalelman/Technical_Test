package com.example.technicaltest.data.repository

import com.example.technicaltest.domain.model.Movie
import com.example.technicaltest.domain.model.MovieDetailResponse
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    suspend fun getPopularMovies(): List<Movie>
    suspend fun getMovieDetails(movieId: Int): MovieDetailResponse
    suspend fun searchMovies(query: String): List<Movie>
    suspend fun getSimilarMovies(movieId: Int): List<Movie>
    fun getFavoriteMovies(): Flow<List<Movie>>
    suspend fun addMovieToFavorites(movie: Movie)
    suspend fun removeMovieFromFavorites(movie: Movie)
    suspend fun isMovieFavorite(movieId: Int): Boolean
}