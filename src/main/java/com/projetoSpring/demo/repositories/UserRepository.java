package com.projetoSpring.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
