package com.lxisoft.AtoZ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.AtoZ.model.Sale;
import com.lxisoft.AtoZ.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {
	
	@Autowired
	SaleRepository saleRepository;

	@Override
	public Sale createBill(Sale sale) {
		
		return saleRepository.save(sale);
	}
}
