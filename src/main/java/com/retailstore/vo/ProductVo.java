package com.retailstore.vo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.retailstore.enumdata.ProductCategory;

public class ProductVo {

	@NotNull
	private String uniqueId;

	@NotNull
	private String name;

	@NotNull
	@Enumerated(EnumType.STRING)
	private ProductCategory productCategory;

	@NotNull
	@DecimalMin(value = "0.1")
	private double rate;

	public ProductVo() {
		super();
	}

	public ProductVo(String uniqueId, double rate, String name, ProductCategory productCategory) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.productCategory = productCategory;
		this.rate = rate;
	}

	public String getUniqueId() {
		return uniqueId;
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

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
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
