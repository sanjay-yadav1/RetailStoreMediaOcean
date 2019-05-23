package com.retailstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.retailstore.entity.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {

}
