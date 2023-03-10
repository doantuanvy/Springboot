package com.example.demohibernatejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demohibernatejpa.entity.Product;



public interface ProductRepository extends JpaRepository<Product, Integer> {

}
