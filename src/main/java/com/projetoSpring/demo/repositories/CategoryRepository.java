package com.projetoSpring.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
