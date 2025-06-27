package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appfilmes.R

class EditarFilmeFragment : Fragment() {

    private lateinit var binding: FragmentFilmeFormBinding
    private val viewModel: FilmeViewModel by viewModels()
    private val args: EditarFilmeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilmeFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launch {
            val filme = viewModel.getById(args.filmeId)
            filme?.let {
                binding.tituloInput.setText(it.titulo)
                binding.diretorInput.setText(it.diretor)
                binding.anoInput.setText(it.ano.toString())
                binding.generoInput.setText(it.genero)

                binding.btnSalvar.setOnClickListener {
                    val atualizado = it.copy(
                        titulo = binding.tituloInput.text.toString(),
                        diretor = binding.diretorInput.text.toString(),
                        ano = binding.anoInput.text.toString().toIntOrNull() ?: 0,
                        genero = binding.generoInput.text.toString()
                    )
                    lifecycleScope.launch {
                        viewModel.update(atualizado)
                        findNavController().popBackStack()
                    }
                }
            }
        }
    }
}
