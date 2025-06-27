package com.example.appfilmes.ui.adapter

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.appfilmes.data.local.entities.Filme

class FilmeAdapter(
    private val onItemClick: (Filme) -> Unit,
    private val onItemLongClick: (Filme) -> Unit
) : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    private var filmes: List<Filme> = listOf()

    fun submitList(lista: List<Filme>) {
        filmes = lista
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val binding = ItemFilmeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilmeViewHolder(binding)
    }

    override fun getItemCount(): Int = filmes.size

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.bind(filmes[position])
    }

    inner class FilmeViewHolder(private val binding: ItemFilmeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(filme: Filme) {
            binding.tituloText.text = filme.titulo
            binding.diretorText.text = "Dir: ${filme.diretor}"
            binding.root.setOnClickListener { onItemClick(filme) }
            binding.root.setOnLongClickListener {
                onItemLongClick(filme)
                true
            }
        }
    }
}
