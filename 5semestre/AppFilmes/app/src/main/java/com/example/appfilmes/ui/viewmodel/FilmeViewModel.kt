package com.example.appfilmes.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.appfilmes.data.local.database.FilmeDatabase
import com.example.appfilmes.data.local.entities.Filme
import com.example.appfilmes.data.local.repository.FilmeRepository
import kotlinx.coroutines.launch

class FilmeViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FilmeRepository
    val filmes: LiveData<List<Filme>>

    init {
        val dao = FilmeDatabase.getDatabase(application).filmeDao()
        repository = FilmeRepository(dao)
        filmes = repository.filmes
    }

    fun insert(filme: Filme) = viewModelScope.launch {
        repository.insert(filme)
    }

    fun update(filme: Filme) = viewModelScope.launch {
        repository.update(filme)
    }

    fun delete(filme: Filme) = viewModelScope.launch {
        repository.delete(filme)
    }

    suspend fun getById(id: Int): Filme? = repository.getById(id)
}
