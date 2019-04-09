package com.lxisoft.AtoZ.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.AtoZ.model.Sale;
import com.lxisoft.AtoZ.service.SaleService;

@RestController
public class SaleController {
	
	@Autowired
	SaleService saleService;
	@PostMapping("/api/create")
	public ResponseEntity<Sale> createBill(@RequestBody Sale sale)throws URISyntaxException{
		
		Sale result=saleService.createBill(sale);
		return ResponseEntity.created(new URI("/api/create/"+result.getId()))
				.header("X-sale-created",result.toString())
				.body(result);
	}
}
