package com.example.demo.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<user,Integer>{

	Optional<user> findByUsername(String username);
}
