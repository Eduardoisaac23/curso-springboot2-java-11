package com.eduardo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
