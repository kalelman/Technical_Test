package com.example.technicaltest.domain.model

import com.google.gson.annotations.SerializedName

data class MovieDetailResponse(
    @SerializedName("results") val movies: List<Movie>
)

data class Movie(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("poster_path") val posterUrl: String,
    @SerializedName("vote_average") val rating: Double
)