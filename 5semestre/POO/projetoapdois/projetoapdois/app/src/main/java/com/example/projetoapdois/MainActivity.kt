package com.example.projetoapdois

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetoapdois.data.FilmeRepository
import com.example.projetoapdois.data.model.Filme
import com.example.projetoapdois.ui.adapter.FilmeAdapter
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val repository = FilmeRepository()
    private lateinit var adapter: FilmeAdapter

    private val filmesExibidos = repository.getFilmes().toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
        recycler.layoutManager = LinearLayoutManager(this)

        adapter = FilmeAdapter(
            onDelete = { filme ->
                deletarFilme(filme, recycler)
            },
            onDetails = { filme ->
                val intent = Intent(this, DetailsActivity::class.java)
                intent.putExtra("filme", filme)
                startActivity(intent)
            }
        )

        recycler.adapter = adapter
        adapter.submitList(filmesExibidos.toList())
    }

    private fun deletarFilme(filme: Filme, recycler: RecyclerView) {
        filmesExibidos.remove(filme)
        adapter.submitList(filmesExibidos.toList())
        Snackbar.make(recycler, "Filme removido com sucesso", Snackbar.LENGTH_SHORT).show()
    }
}

