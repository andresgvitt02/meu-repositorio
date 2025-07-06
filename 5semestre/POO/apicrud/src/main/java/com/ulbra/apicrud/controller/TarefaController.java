package com.ulbra.apicrud.controller;

import com.ulbra.apicrud.dto.TarefaDTO;
import com.ulbra.apicrud.mapper.TarefaMapper;
import com.ulbra.apicrud.model.Tarefa;
import com.ulbra.apicrud.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public List<TarefaDTO> getAll() {
        return service.getAll()
                .stream()
                .map(TarefaMapper::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaDTO> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(tarefa -> ResponseEntity.ok(TarefaMapper.toDTO(tarefa)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/usuario/{usuarioId}")
    public ResponseEntity<TarefaDTO> create(@PathVariable Long usuarioId, @RequestBody TarefaDTO tarefaDTO) {
        Tarefa tarefa = TarefaMapper.toEntity(tarefaDTO);
        Tarefa nova = service.save(usuarioId, tarefa);
        return ResponseEntity.ok(TarefaMapper.toDTO(nova));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TarefaDTO> update(@PathVariable Long id, @RequestBody TarefaDTO tarefaDTO) {
        Tarefa tarefa = TarefaMapper.toEntity(tarefaDTO);
        Tarefa atualizada = service.update(id, tarefa);
        return ResponseEntity.ok(TarefaMapper.toDTO(atualizada));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

