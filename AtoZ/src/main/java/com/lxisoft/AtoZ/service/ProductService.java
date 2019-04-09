package com.lxisoft.AtoZ.service;

import java.util.List;

import java.util.Optional;

import com.lxisoft.AtoZ.model.Product;

public interface ProductService {

	Product addProduct(Product product);
	
	List<Product> getAllProducts();
	
	Optional<Product> getProduct(Long id);
	
	Product modifyproduct(Product product);
	
	void deleteProduct(Long id);
	
}
