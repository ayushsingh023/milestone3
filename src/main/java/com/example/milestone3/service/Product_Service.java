package com.example.milestone3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.milestone3.Entity.Product;
import com.example.milestone3.repository.ProductRepository;

@Service
public class Product_Service {
	
	@Autowired
	private ProductRepository productRepository;
//
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
//	public Product savedetails(Product product) {
//		return productRepository.savedetails(product);
//	}

	public Product saveDetails(Product product) {
		return productRepository.save(product);
	}
	


}
