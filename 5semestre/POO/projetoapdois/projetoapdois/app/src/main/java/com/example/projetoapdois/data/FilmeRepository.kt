package com.example.projetoapdois.data

import com.example.projetoapdois.R
import com.example.projetoapdois.data.model.Filme

class FilmeRepository {
    private val filmes = listOf(
        Filme(
            1,
            "O Rei Leão",
            "Roger Allers e Rob Minkoff",
            1994,
            "A emocionante jornada de Simba, um jovem leão destinado a ser rei, enfrentando desafios para assumir seu lugar no ciclo da vida.",
            R.drawable.rei_leao
        ),
        Filme(
            2,
            "A Bela e a Fera",
            "Gary Trousdale e Kirk Wise",
            1991,
            "A história de amor entre uma jovem inteligente e um príncipe preso em uma forma bestial, que aprende o verdadeiro significado da beleza interior.",
            R.drawable.bela_fera
        ),
        Filme(
            3,
            "Aladdin",
            "Ron Clements e John Musker",
            1992,
            "Aladdin encontra uma lâmpada mágica que realiza desejos, embarcando numa aventura para conquistar o coração da princesa Jasmine.",
            R.drawable.aladdin
        ),
        Filme(
            4,
            "A Pequena Sereia",
            "Ron Clements e John Musker",
            1989,
            "Ariel, uma jovem sereia curiosa, sonha em viver no mundo humano e faz um pacto perigoso para conquistar o amor do príncipe Eric.",
            R.drawable.pequena_sereia
        ),
        Filme(
            5,
            "Frozen",
            "Chris Buck e Jennifer Lee",
            2013,
            "Duas irmãs com poderes mágicos enfrentam desafios para salvar seu reino e descobrem a força do amor verdadeiro e da família.",
            R.drawable.frozen
        ),
        Filme(
            6,
            "Mulan",
            "Tony Bancroft e Barry Cook",
            1998,
            "Mulan se disfarça de soldado para proteger seu pai e provar sua coragem, enfrentando batalhas épicas e descobrindo seu verdadeiro valor.",
            R.drawable.mulan
        ),
        Filme(
            7,
            "Pocahontas",
            "Mike Gabriel e Eric Goldberg",
            1995,
            "A história de Pocahontas, a jovem nativa americana, que busca a paz entre seu povo e os colonizadores ingleses através do amor e da compreensão.",
            R.drawable.pocahontas
        ),
        Filme(
            8,
            "Toy Story",
            "John Lasseter",
            1995,
            "Os brinquedos de Andy ganham vida quando ele não está por perto, vivendo aventuras e aprendendo o valor da amizade verdadeira.",
            R.drawable.toy_story
        ),
        Filme(
            9,
            "Cinderela",
            "Clyde Geronimi",
            1950,
            "A clássica história da jovem bondosa que, com a ajuda da fada madrinha, supera adversidades para encontrar seu príncipe encantado.",
            R.drawable.cinderela
        ),
        Filme(
            10,
            "Moana",
            "Ron Clements e John Musker",
            2016,
            "Moana parte em uma jornada pelo oceano para salvar seu povo, descobrindo sua própria identidade e a importância da coragem.",
            R.drawable.moana
        )
    )

    fun getFilmes() = filmes
}
