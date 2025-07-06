package com.ulbra.apicrud.mapper;

import com.ulbra.apicrud.dto.UsuarioDTO;
import com.ulbra.apicrud.dto.TarefaDTO;
import com.ulbra.apicrud.model.Usuario;

import java.util.stream.Collectors;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setTarefas(
                usuario.getTarefas().stream()
                        .map(TarefaMapper::toDTO)
                        .collect(Collectors.toList())
        );
        return dto;
    }
}
