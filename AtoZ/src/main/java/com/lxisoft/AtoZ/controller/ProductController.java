package com.lxisoft.AtoZ.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.AtoZ.model.Product;
import com.lxisoft.AtoZ.service.ProductService;



@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/api/create")
	public ResponseEntity<Product> createContact(@RequestBody Product product) throws URISyntaxException {
		Product result = productService.addProduct(product);
		return ResponseEntity.created(new URI("/api/create/"+result.getId()))
				.header("X-contact-created", result.toString())
				.body(result);
	}
	

	@GetMapping("/api/get")
	public ResponseEntity<List<Product>> readAllProducts() {
	
		List<Product> result = productService.getAllProducts();
		return ResponseEntity.ok()
				.body(result);
	}
	
	@GetMapping("/api/get/{id}")
	public ResponseEntity<Product> readProduct(@PathVariable Long id) {
		Optional<Product> result = productService.getProduct(id);
		return ResponseEntity.of(result);
	}
	
	@PutMapping("/api/update")
	public ResponseEntity<Product> updateContact(@RequestBody Product product) throws URISyntaxException {
		if(product.getId() != 0)
		{
			Product result = productService.modifyproduct(product);
			return ResponseEntity.ok()
		            .header("X-contact-updated", result.toString())
		            .body(result);
		}
		return ResponseEntity.badRequest()
				.body(null);
	}
}
