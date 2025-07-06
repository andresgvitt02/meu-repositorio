package com.ulbra.apicrud.dto;

public class TarefaDTO {
    private Long id;
    private String descricao;
    private boolean concluida;

    public TarefaDTO() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public boolean isConcluida() { return concluida; }
    public void setConcluida(boolean concluida) { this.concluida =concluida;}
}
