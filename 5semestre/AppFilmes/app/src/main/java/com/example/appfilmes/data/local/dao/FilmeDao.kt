package com.example.appfilmes.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.appfilmes.data.local.entities.Filme

@Dao
interface FilmeDao {
    @Query("SELECT * FROM filmes")
    fun getAll(): LiveData<List<Filme>>

    @Query("SELECT * FROM filmes WHERE id = :id")
    suspend fun getById(id: Int): Filme?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(filme: Filme)

    @Update
    suspend fun update(filme: Filme)

    @Delete
    suspend fun delete(filme: Filme)
}