package com.eduardo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.curso.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
