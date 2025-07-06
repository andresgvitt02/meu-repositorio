package com.ulbra.apicrud.service;

import com.ulbra.apicrud.model.Tarefa;
import com.ulbra.apicrud.model.Usuario;
import com.ulbra.apicrud.repository.TarefaRepository;
import com.ulbra.apicrud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Tarefa> getAll() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> getById(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa save(Long userId, Tarefa tarefa) {
        Usuario usuario = usuarioRepository.findById(userId).orElseThrow();
        tarefa.setUsuario(usuario);
        return tarefaRepository.save(tarefa);
    }

    public Tarefa update(Long id, Tarefa updatedTarefa) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow();
        tarefa.setDescricao(updatedTarefa.getDescricao());
        tarefa.setConcluida(updatedTarefa.isConcluida());
        return tarefaRepository.save(tarefa);
    }

    public void delete(Long id) {
        tarefaRepository.deleteById(id);
    }
}
