package com.projetoSpring.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
