package com.example.SpringDatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDatabase.pojo.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{

}
