package com.example.milestone3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.milestone3.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

//	Product savedetails(Product product);
    // Custom queries (if needed)
}
