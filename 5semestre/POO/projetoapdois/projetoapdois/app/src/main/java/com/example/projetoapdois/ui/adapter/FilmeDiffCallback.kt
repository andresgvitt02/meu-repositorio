package com.example.projetoapdois.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.projetoapdois.data.model.Filme

class FilmeDiffCallback : DiffUtil.ItemCallback<Filme>() {
    override fun areItemsTheSame(oldItem: Filme, newItem: Filme) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Filme, newItem: Filme) = oldItem == newItem
}
