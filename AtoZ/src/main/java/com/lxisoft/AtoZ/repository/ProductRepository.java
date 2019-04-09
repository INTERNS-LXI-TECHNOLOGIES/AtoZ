package com.lxisoft.AtoZ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.AtoZ.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
