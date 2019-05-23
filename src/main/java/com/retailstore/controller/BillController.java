package com.retailstore.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retailstore.entity.Bill;
import com.retailstore.entity.Product;
import com.retailstore.service.BillService;
import com.retailstore.vo.ProductVo;

@RestController
@RequestMapping("/retailStore")
public class BillController {
	@Autowired
	private BillService billService;

	final Logger logger = LogManager.getLogger(getClass());

	@RequestMapping(value = "/product/{scanId}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProductByScanCode(@PathVariable String scanId) {
		return new ResponseEntity<>(billService.getProductByScanCode(scanId), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public ResponseEntity<Product> addProduct(@RequestBody ProductVo productVo, String billId) {
		logger.info("Add product to bill = " + productVo);
		Product product = billService.addScanProduct(productVo, billId);
		logger.info("Added product to bill = " + product.getId());
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/bills", method = RequestMethod.POST)
	public ResponseEntity<Bill> createBill() {
		logger.info("Processing create Bill request :: ");
		Bill bill = billService.createBill(new Bill(100, 5));
		logger.info("Created Bill with id = " + bill.getId());		
		
		return new ResponseEntity<>(bill, HttpStatus.CREATED);
	}	
	
	@RequestMapping(value = "/bills/{id}", method = RequestMethod.GET)
	public ResponseEntity<Bill> getBillById(@PathVariable Long id) {
		return new ResponseEntity<>(billService.getBillById(id), HttpStatus.OK);
	}
	
	

}
