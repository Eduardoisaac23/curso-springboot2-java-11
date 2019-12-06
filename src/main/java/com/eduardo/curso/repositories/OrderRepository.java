package com.eduardo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.curso.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
