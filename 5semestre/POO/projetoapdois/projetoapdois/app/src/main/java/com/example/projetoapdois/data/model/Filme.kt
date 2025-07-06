package com.example.projetoapdois.data.model

import java.io.Serializable

data class Filme(
    val id: Int,
    val titulo: String,
    val diretor: String,
    val ano: Int,
    val frase: String,
    val imagemResId: Int
) : Serializable
