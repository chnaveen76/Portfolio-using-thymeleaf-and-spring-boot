package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.entity.User;

@Repository
public interface MyRepository extends JpaRepository<User, Integer>{

}
