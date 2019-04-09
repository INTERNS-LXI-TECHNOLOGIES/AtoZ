package com.lxisoft.AtoZ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.AtoZ.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
