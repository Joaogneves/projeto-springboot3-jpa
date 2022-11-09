package com.cursojavajoao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavajoao.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
