package com.cursojavajoao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavajoao.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
