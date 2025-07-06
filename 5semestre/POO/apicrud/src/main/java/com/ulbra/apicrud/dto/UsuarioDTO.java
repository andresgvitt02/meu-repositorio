package com.ulbra.apicrud.dto;

import java.util.List;

public class UsuarioDTO {
    private Long id;
    private String nome;
    private List<TarefaDTO> tarefas;

    public UsuarioDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<TarefaDTO> getTarefas() { return tarefas; }
    public void setTarefas(List<TarefaDTO> tarefas) { this.tarefas=tarefas;}
}
