package com.example.demohibernatejpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demohibernatejpa.entity.Product;
import com.example.demohibernatejpa.repository.ProductRepository;





@Service
public class ProductService {
@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}
	
	public List<Product> getProductus() {
		return productRepository.findAll();
	}
}
