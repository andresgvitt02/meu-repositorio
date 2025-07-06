package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.appfilmes.databinding.FragmentDetalhesFilmeBinding
import com.example.appfilmes.ui.viewmodel.FilmeViewModel
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class DetalhesFilmeFragment : Fragment() {

    private lateinit var binding: FragmentDetalhesFilmeBinding
    private val viewModel: FilmeViewModel by viewModels()
    private val args: DetalhesFilmeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetalhesFilmeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val filme = viewModel.getById(args.filmeId)
            filme?.let {
                binding.tituloText.text = it.titulo
                binding.diretorText.text = it.diretor
                binding.anoText.text = it.ano.toString()
                binding.generoText.text = it.genero
            }
        }

        binding.btnEditar.setOnClickListener {
            val action = DetalhesFilmeFragmentDirections
                .actionDetalhesFilmeFragmentToEditarFilmeFragment(args.filmeId)
            findNavController().navigate(action)
        }
    }
}
