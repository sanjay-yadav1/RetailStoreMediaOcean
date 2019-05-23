package com.retailstore.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.entity.Bill;
import com.retailstore.entity.Product;
import com.retailstore.repository.BillRepository;
import com.retailstore.vo.ProductVo;

@Service
public class BillService {

	@Autowired
	private BillRepository billRepo;
	
	final Logger logger = LogManager.getLogger(getClass());	

	public Bill createBill(Bill bill) {
		logger.info("Create bill progress = " + bill);
		Bill bill1 = billRepo.save(bill);
		logger.info("Created bill with id = " + bill1.getId());
		return bill1;

	}

	public Iterable<Bill> getAllBills() {
		Iterable<Bill> bill = billRepo.findAll();
		logger.info("returning all products");
		return bill;
	}

	public Bill getBillById(Long id) {
		return billRepo.findOne(id);
	}	

	public Product addScanProduct(ProductVo productVo, String billId) {
		// TODO This method will add product to bill which can be used later to generate bill.
		//Here we will write logic to add new scan product to bill
		return null;
	}
	
	public void removeProduct(ProductVo productVo, String billId) {
		// TODO This method will remove product from bill which can be used later to generate bill.
	}

	public Product getProductByScanCode(String scanCode) {
		// TODO Logic to fetch product based on scan code of item
		return null;
	}

}
