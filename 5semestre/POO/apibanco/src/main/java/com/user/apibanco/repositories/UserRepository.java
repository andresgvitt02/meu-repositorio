package com.user.apibanco.repositories;

import com.user.apibanco.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
