package com.app.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.application.entities.Products;
import com.app.application.service.ProductsService;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {
	
	@Autowired
	private ProductsService service;
	
	@GetMapping
	public ResponseEntity<List<Products>> findAll(){
		List<Products> products = service.findAll();
		return ResponseEntity.ok().body(products);
	}
	@PostMapping
	public ResponseEntity<Products> insert(@RequestBody Products prod){
			Products products =  service.insert(prod);
			return ResponseEntity.ok().body(products);
	}
}
