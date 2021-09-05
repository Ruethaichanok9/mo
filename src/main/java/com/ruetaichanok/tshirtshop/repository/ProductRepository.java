package com.ruetaichanok.tshirtshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ruetaichanok.tshirtshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p WHERE CONCAT(p.no112productname,' ',no112productdescription,' ',p.no112productprice) LIKE %?1%")
	public List<Product> search(String keyword);
}