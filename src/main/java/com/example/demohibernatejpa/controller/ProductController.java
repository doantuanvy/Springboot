package com.example.demohibernatejpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demohibernatejpa.entity.Product;
import com.example.demohibernatejpa.repository.ProductRepository;
import com.example.demohibernatejpa.service.ProductService;




@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
@Autowired
private ProductRepository repository;
@GetMapping("")
//public List<Product> getAllProducts(){
//// http://localhost:8080/api/v1/Products
//	return repository.findAll();
//}
public List<Product> getAllProducts(){
	// http://localhost:8080/api/v1/Products
		return repository.findAll();
	}
@PostMapping("/addProduct")
public Product addProduct(@RequestBody Product product) {
	return repository.save(product);
}

}
