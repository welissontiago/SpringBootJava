package com.projetoSpring.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.demo.entities.OrderItem;
import com.projetoSpring.demo.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

	
}
