package com.lxisoft.AtoZ.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.AtoZ.model.Product;
import com.lxisoft.AtoZ.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepo;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> getProduct(Long id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id);
	}

	@Override
	public Product modifyproduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		productRepo.delete(productRepo.getOne(id));
	}


	
	
}
