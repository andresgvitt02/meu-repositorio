package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.appfilmes.R
import com.example.appfilmes.data.local.entities.Filme
import com.example.appfilmes.databinding.FragmentEditarFilmeBinding
import com.example.appfilmes.ui.viewmodel.FilmeViewModel
import kotlinx.coroutines.launch

class EditarFilmeFragment : Fragment() {

    private var _binding: FragmentEditarFilmeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: FilmeViewModel by viewModels()
    private val args: EditarFilmeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEditarFilmeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val filmeId = args.filmeId ?: run {
            findNavController().popBackStack()
            return
        }

        lifecycleScope.launch {
            val filme = viewModel.getById(filmeId)

            if (filme == null) {
                findNavController().popBackStack()
                return@launch
            }

            binding.tituloInput.setText(filme.titulo)
            binding.diretorInput.setText(filme.diretor)
            binding.anoInput.setText(filme.ano.toString())
            binding.generoInput.setText(filme.genero)

            binding.btnSalvar.setOnClickListener {
                val ano = binding.anoInput.text.toString().toIntOrNull() ?: filme.ano

                val filmeAtualizado = filme.copy(
                    titulo = binding.tituloInput.text.toString(),
                    diretor = binding.diretorInput.text.toString(),
                    ano = ano,
                    genero = binding.generoInput.text.toString()
                )

                lifecycleScope.launch {
                    viewModel.update(filmeAtualizado)
                    findNavController().popBackStack()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}