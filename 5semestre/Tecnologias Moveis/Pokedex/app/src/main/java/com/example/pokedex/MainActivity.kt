package com.example.pokedex

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)  // Configura a Toolbar como a ActionBar
        supportActionBar?.title = "Minha Toolbar"

        // Referência ao botão
        val meuBotao: Button = findViewById(R.id.btnClick)

        // Configurar clique no botão
        meuBotao.setOnClickListener {
            Toast.makeText(this, "Botão Clicado!", Toast.LENGTH_SHORT).show()
        }
    }
}
