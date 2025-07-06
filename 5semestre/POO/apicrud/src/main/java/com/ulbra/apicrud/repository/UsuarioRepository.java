package com.ulbra.apicrud.repository;

import com.ulbra.apicrud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {}
