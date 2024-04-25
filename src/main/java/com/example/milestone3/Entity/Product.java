package com.example.milestone3.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@Table(name="productinfo")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
    @Id
    @Column (name="pid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
 
    @Column //(nullable = false)
    private String productname;
 
    @Column //(nullable = false)
    private int quantity;
 
    @Column //(nullable = false)
    private double price;
 
}