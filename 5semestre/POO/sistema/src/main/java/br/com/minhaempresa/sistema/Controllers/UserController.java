package br.com.minhaempresa.sistema.Controllers;

import br.com.minhaempresa.sistema.Models.User;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> listaDeUser = new ArrayList<>();

    public UserController(){
        listaDeUser.add(new User("Andres", 1, "Andres@Outlook.com"));
        listaDeUser.add(new User("João", 2, "Joao@Outlook.com"));
        listaDeUser.add(new User("Pedro", 3, "Pedro@Outlook.com"));
    }

    @GetMapping("/{id}")
        public User getUser(@PathVariable int id) {
        return listaDeUser
                .stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElseThrow();
    }


    @GetMapping
    public List<User> getUsers(){
        return listaDeUser;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        listaDeUser.add(user);
        return user;
    }

}
