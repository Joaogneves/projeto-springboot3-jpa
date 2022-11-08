package com.cursojavajoao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavajoao.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
