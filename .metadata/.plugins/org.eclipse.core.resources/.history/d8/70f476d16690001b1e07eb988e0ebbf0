package com.app.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.application.entities.Products;
import com.app.application.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository repository;
	
	@Transactional
	public List<Products> findAll(){
		List<Products> products = repository.findAll();
		return products;
	}
	@Transactional
	public Products insert(Products product){
		return repository.save(product);
	}
}
