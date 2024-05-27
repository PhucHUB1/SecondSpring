package com.example.secondspring;

import org.springframework.data.jpa.repository.JpaRepository;

//model
public interface ProductRepository extends JpaRepository<Product, Long> {

}