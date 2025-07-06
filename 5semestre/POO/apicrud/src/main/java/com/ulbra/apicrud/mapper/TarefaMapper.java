package com.ulbra.apicrud.mapper;


import com.ulbra.apicrud.dto.TarefaDTO;
import com.ulbra.apicrud.model.Tarefa;

public class TarefaMapper {
    public static TarefaDTO toDTO(Tarefa tarefa) {
        TarefaDTO dto = new TarefaDTO();
        dto.setId(tarefa.getId());
        dto.setDescricao(tarefa.getDescricao());
        dto.setConcluida(tarefa.isConcluida());
        return dto;
    }

    public static Tarefa toEntity(TarefaDTO dto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setId(dto.getId());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setConcluida(dto.isConcluida());
        return tarefa;
    }
}

