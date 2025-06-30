package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appfilmes.databinding.FragmentListaFilmesBinding
import com.example.appfilmes.ui.adapter.FilmeAdapter
import com.example.appfilmes.ui.viewmodel.FilmeViewModel

class ListaFilmesFragment : Fragment() {

    private lateinit var binding: FragmentListaFilmesBinding
    private val viewModel: FilmeViewModel by viewModels()
    private lateinit var adapter: FilmeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListaFilmesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = FilmeAdapter(
            onItemClick = { filme ->
                val action = ListaFilmesFragmentDirections.actionListaFilmesToDetalhesFilme(filme.id)
                findNavController().navigate(action)
            },
            onItemLongClick = { filme ->
                viewModel.delete(filme)
            },
            onDeleteClick = { filme ->
                viewModel.delete(filme)
            }
        )

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.filmes.observe(viewLifecycleOwner, Observer { filmes ->
            adapter.submitList(filmes)
        })

        binding.fabAdd.setOnClickListener {
            val action = ListaFilmesFragmentDirections.actionListaFilmesToAdicionarFilme()
            findNavController().navigate(action)
        }
    }
}
