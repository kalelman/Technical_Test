package com.example.technicaltest.data.repository

import com.example.technicaltest.data.local.MovieDao
import com.example.technicaltest.data.remote.MovieApiService
import com.example.technicaltest.domain.model.Movie
import com.example.technicaltest.domain.model.MovieDetailResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiService: MovieApiService,
    private val movieDao: MovieDao
): IMovieRepository {

    // Securely retrieve API Key from BuildConfig
    private val API_KEY = BuildConfig.MOVIE_API_KEY

    override suspend fun getPopularMovies(): List<Movie> {
        return apiService.getPopularMovies(API_KEY).movies
    }

    override suspend fun getMovieDetails(movieId: Int): MovieDetailResponse {
        return apiService.getMovieDetails(movieId, API_KEY)
    }

    override suspend fun searchMovies(query: String): List<Movie> {
        return apiService.searchMovies(query, API_KEY).movies
    }

    override suspend fun getSimilarMovies(movieId: Int): List<Movie> {
        return apiService.getSimilarMovies(movieId, API_KEY).movies
    }

    override fun getFavoriteMovies(): Flow<List<Movie>> = movieDao.getFavoriteMovies()

    override suspend fun addMovieToFavorites(movie: Movie) {
        movieDao.addMovieToFavorites(movie.toEntity())
    }

    override suspend fun removeMovieFromFavorites(movie: Movie) {
        movieDao.removeMovieFromFavorites(movie.toEntity())
    }

    override suspend fun isMovieFavorite(movieId: Int): Boolean {
        return movieDao.isMovieFavorite(movieId)
    }
}