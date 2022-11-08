package com.cursojavajoao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavajoao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
