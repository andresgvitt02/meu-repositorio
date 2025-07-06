package com.ulbra.apicrud.repository;

import com.ulbra.apicrud.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {}
