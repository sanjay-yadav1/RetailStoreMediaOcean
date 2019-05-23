package com.retailstore.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.retailstore.enumdata.ProductCategory;

@Entity
@Table(name = "product")

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull	
	private String uniqueId;

	@NotNull
	private String name;

	@NotNull
	@Enumerated(EnumType.STRING)
	private ProductCategory productCategory;

	@NotNull
	private double rate;

	public Product() {
		super();
	}

	public Product(String uniqueId, double rate, String name, ProductCategory productCategory) {
		super();
		this.uniqueId = uniqueId;
		this.rate = rate;
		this.name = name;
		this.productCategory = productCategory;
	}

	public String getBarCodeId() {
		return uniqueId;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public double getRate() {
		return rate;
	}

	public void setBarCodeId(String barCodeId) {
		this.uniqueId = barCodeId;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
