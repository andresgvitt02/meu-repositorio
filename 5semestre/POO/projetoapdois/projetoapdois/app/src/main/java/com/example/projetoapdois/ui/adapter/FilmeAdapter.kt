package com.example.projetoapdois.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.projetoapdois.R
import com.example.projetoapdois.data.model.Filme

class FilmeAdapter(
    private val onDelete: (Filme) -> Unit,
    private val onDetails: (Filme) -> Unit
) : ListAdapter<Filme, FilmeViewHolder>(FilmeDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.filme_item_list, parent, false)
        return FilmeViewHolder(view, onDelete, onDetails)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun removerFilme(filme: Filme) {
        val novaLista = currentList.toMutableList()
        novaLista.remove(filme)
        submitList(novaLista)
    }
}
