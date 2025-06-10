package com.user.apibanco.services;
import com.user.apibanco.entities.User;
import com.user.apibanco.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return this.userRepository.findById(id).orElseThrow();
    }

    public Page<UserDTO> getUsers(Pageable pageable) {
        return this.userRepository.findAll(pageable)
                .map(item -> new UserDTO(item.getId(), item.getName(), item.getEmail()));
    }

    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    public void deleteUser(Long id) {
        User user = this.userRepository.findById(id).orElseThrow();
        this.userRepository.delete(user);
    }

}