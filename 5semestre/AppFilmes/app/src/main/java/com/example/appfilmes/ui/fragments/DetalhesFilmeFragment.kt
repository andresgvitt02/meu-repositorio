package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appfilmes.R


class DetalhesFilmeFragment : Fragment() {

    private lateinit var binding: FragmentFilmeDetailBinding
    private val viewModel: FilmeViewModel by viewModels()
    private val args: DetalhesFilmeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilmeDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launch {
            val filme = viewModel.getById(args.filmeId)
            filme?.let {
                binding.tituloText.text = it.titulo
                binding.diretorText.text = it.diretor
                binding.anoText.text = it.ano.toString()
                binding.generoText.text = it.genero
            }
        }
    }
}