package com.app.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.application.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{

}
