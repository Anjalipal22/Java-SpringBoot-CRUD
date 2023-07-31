package com.springboot.javawebapp.repository;

import com.springboot.javawebapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

Product findByName(String name);
}
