package com.spring.curd.api.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curd.api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
