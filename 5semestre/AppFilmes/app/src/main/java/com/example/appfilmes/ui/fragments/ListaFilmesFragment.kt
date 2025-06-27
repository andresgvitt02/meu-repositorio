package com.example.appfilmes.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appfilmes.R
import com.example.appfilmes.ui.adapter.FilmeAdapter
import com.example.appfilmes.ui.viewmodel.FilmeViewModel

class ListaFilmesFragment : Fragment() {

    private lateinit var binding: FragmentFilmeListBinding
    private val viewModel: FilmeViewModel by viewModels()
    private lateinit var adapter: FilmeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilmeListBinding.inflate(inflater, container, false)
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
            }
        )

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.filmes.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })

        binding.fabAdd.setOnClickListener {
            findNavController().navigate(ListaFilmesFragmentDirections.actionListaFilmesToAdicionarFilme(null))
        }
    }
}