package com.eric.invapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.invapi.models.Product;
import com.eric.invapi.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		return this.productRepository.save(product);
	}
	
	
	public List<Product> getAllProducts(){
		return this.productRepository.findAll();
	}
	
	public Product getProductById(long productId){
		return this.productRepository.findById(productId).orElse(null);
	}
}
