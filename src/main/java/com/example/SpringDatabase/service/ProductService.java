package com.example.SpringDatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDatabase.pojo.Product;
import com.example.SpringDatabase.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	public Product insertProduct(Product p)
	{
		return productRepo.save(p);
	}
	public List<Product> getAllProducts()
	{
		return (List<Product>) productRepo.findAll();
	}
	public void deleteProducts()
	{
		 productRepo.deleteAll();
	}

}
