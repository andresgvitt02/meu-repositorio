package com.example.projetoapdois

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.projetoapdois.data.model.Filme

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detalhes do Filme"

        toolbar.setNavigationOnClickListener {
            finish()
        }

        val filme = intent.getSerializableExtra("filme") as? Filme ?: return

        val titulo = findViewById<TextView>(R.id.detalheTitulo)
        val diretor = findViewById<TextView>(R.id.detalheDiretor)
        val ano = findViewById<TextView>(R.id.detalheAno)
        val sinopse = findViewById<TextView>(R.id.detalheSinopse)
        val imagem = findViewById<ImageView>(R.id.detalheImagem)

        titulo.text = filme.titulo
        diretor.text = "DIREÇÃO: ${filme.diretor}"
        ano.text = "ANO DE LANÇAMENTO: ${filme.ano}"
        sinopse.text = "SINOPSE: ${filme.frase}"
        imagem.setImageResource(filme.imagemResId)
    }
}
