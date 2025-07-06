package com.example.projetoapdois.ui.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projetoapdois.R
import com.example.projetoapdois.data.model.Filme

class FilmeViewHolder(
    itemView: View,
    private val onDelete: (Filme) -> Unit,
    private val onDetails: (Filme) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val imagem: ImageView = itemView.findViewById(R.id.imagemFilme)
    private val titulo: TextView = itemView.findViewById(R.id.tituloFilme)
    private val ano: TextView = itemView.findViewById(R.id.anoFilme)
    private val detalhes: TextView = itemView.findViewById(R.id.botaoDetalhes)

    fun bind(filme: Filme) {
        titulo.text = filme.titulo
        ano.text = filme.ano.toString()
        imagem.setImageResource(filme.imagemResId)

        detalhes.setOnClickListener {
            onDetails(filme)
        }

        itemView.setOnLongClickListener {
            onDelete(filme)
            true
        }
    }
}
