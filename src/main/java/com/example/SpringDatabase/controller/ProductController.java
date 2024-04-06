package com.example.SpringDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDatabase.pojo.Product;
import com.example.SpringDatabase.service.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ProductController {
	
	@Autowired
	ProductService proService;
	@PostMapping("/addproduct")
	public ResponseEntity<?> insertProduct(@RequestBody Product product)
	{
		return new ResponseEntity<>(proService.insertProduct(product),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts()
	{
		return proService.getAllProducts();
	}
	
	@DeleteMapping("/delete")
	public void deleteProducts()
	{
		proService.deleteProducts();
	}

}
