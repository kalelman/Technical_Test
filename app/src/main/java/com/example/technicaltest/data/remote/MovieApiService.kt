package com.example.technicaltest.data.remote

import com.example.technicaltest.domain.model.MovieDetailResponse
import com.example.technicaltest.domain.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): MovieResponse

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(@Path("movie_id") movieId: Int, @Query("api_key") apiKey: String): MovieDetailResponse

    @GET("movie/{movie_id}/similar")
    suspend fun getSimilarMovies(@Path("movie_id") movieId: Int, @Query("api_key") apiKey: String): MovieResponse

    @GET("search/movie")
    suspend fun searchMovies(@Query("query") query: String, @Query("api_key") apiKey: String): MovieResponse
}