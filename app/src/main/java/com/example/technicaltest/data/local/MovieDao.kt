package com.example.technicaltest.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addMovieToFavorites(movie: MovieEntity)

    @Delete
    suspend fun removeMovieFromFavorites(movie: MovieEntity)

    @Query("SELECT * FROM favorite_movies")
    fun getFavoriteMovies(): Flow<List<MovieEntity>>

    @Query("SELECT EXISTS(SELECT 1 FROM favorite_movies WHERE id = :movieId)")
    suspend fun isMovieFavorite(movieId: Int): Boolean
}