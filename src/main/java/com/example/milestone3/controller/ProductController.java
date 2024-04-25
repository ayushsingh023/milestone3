package com.example.milestone3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.milestone3.Entity.Product;
import com.example.milestone3.service.Product_Service;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	
	private Product_Service product_service;

	public Product_Service getProduct_service() {
		return product_service;
	}

	public void setProduct_service(Product_Service product_service) {
		this.product_service = product_service;
	}
	
	@PostMapping("/addProduct")
	public Product  postDetails(@RequestBody Product product) {
		return product_service.saveDetails(product);
		
	}
	
//    private final Product_Service productService = null;
//
//    @PostMapping
//    public void addProduct(@RequestBody Product product) {
//        // Implement logic to add a product
//    }
//
    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        // Implement logic to delete a product
    }
//
    @PutMapping("/{productId}")
    public void updateProduct(@PathVariable Long productId, @RequestBody Product updatedProduct) {
        // Implement logic to update a product
    }

    @GetMapping("/{productId}")
    public void getProduct(@PathVariable Long productId) {
        // Implement logic to retrieve a product
    }

    @GetMapping
    public void getAllProducts() {
        // Implement logic to retrieve all products
    }

	public Product_Service getProductService() {
		return product_service;
	}
}
