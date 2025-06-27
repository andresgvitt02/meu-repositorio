package com.example.appfilmes.data.local.repository

import com.example.appfilmes.data.local.dao.FilmeDao
import com.example.appfilmes.data.local.entities.Filme

class FilmeRepository(private val dao: FilmeDao) {
    val filmes = dao.getAll()

    suspend fun insert(filme: Filme) = dao.insert(filme)
    suspend fun update(filme: Filme) = dao.update(filme)
    suspend fun delete(filme: Filme) = dao.delete(filme)
    suspend fun getById(id: Int) = dao.getById(id)
}