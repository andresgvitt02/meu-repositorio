package com.ulbra.apicrud.controller;

import com.ulbra.apicrud.dto.UsuarioDTO;
import com.ulbra.apicrud.mapper.UsuarioMapper;
import com.ulbra.apicrud.model.Usuario;
import com.ulbra.apicrud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    // GET /usuarios
    @GetMapping
    public List<UsuarioDTO> getAll() {
        return service.getAll()
                .stream()
                .map(UsuarioMapper::toDTO)
                .toList();
    }

    // GET /usuarios/{id}
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(UsuarioMapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    // POST /usuarios
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    // PUT /usuarios/{id}
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.update(id, usuario);
    }

    // DELETE /usuarios/{id}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
