package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.appfilmes.R
import com.example.appfilmes.data.local.entities.Filme
import com.example.appfilmes.databinding.FragmentAdicionarFilmeBinding
import com.example.appfilmes.ui.viewmodel.FilmeViewModel
import kotlinx.coroutines.Dispatchers
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch



class AdicionarFilmeFragment : Fragment() {

    private lateinit var binding: FragmentAdicionarFilmeBinding
    private val viewModel: FilmeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAdicionarFilmeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSalvar.setOnClickListener {
            val filme = Filme(
                titulo = binding.tituloInput.text.toString(),
                diretor = binding.diretorInput.text.toString(),
                ano = binding.anoInput.text.toString().toIntOrNull() ?: 0,
                genero = binding.generoInput.text.toString()
            )
            CoroutineScope(Dispatchers.Main).launch {
                viewModel.insert(filme)
                findNavController().popBackStack()
            }
        }
    }
}