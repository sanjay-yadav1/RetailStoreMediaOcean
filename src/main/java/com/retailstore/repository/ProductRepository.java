package com.retailstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.retailstore.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	public long count();

	public List<Product> findByBarCodeId(String barCodeId);

}
