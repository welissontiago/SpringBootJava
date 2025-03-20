package com.projetoSpring.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
