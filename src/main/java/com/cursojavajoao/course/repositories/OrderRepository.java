package com.cursojavajoao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavajoao.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
