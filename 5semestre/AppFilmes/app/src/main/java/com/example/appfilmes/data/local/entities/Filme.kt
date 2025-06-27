package com.example.appfilmes.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "filmes")
data class Filme(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val titulo: String,
    val diretor: String,
    val ano: Int,
    val genero: String
)