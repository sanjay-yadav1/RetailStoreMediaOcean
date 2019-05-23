package com.retailstore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "bills")

public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int noOfItems;
	
	private double totalCost;

	private double totalTax;

	private double totalValue;
	
	private List<Items> items;

	public Bill() {
		super();
	}

	public Bill(double totalValue, int noOfItems) {
		super();
		this.totalValue = totalValue;
		this.noOfItems = noOfItems;
	}

	public Bill(List<Items> items) {
		super();
		this.items = items;
	}

	public long getId() {
		return id;
	}

	public List<Items> getLineItems() {
		return items;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLineItems(List<Items> items) {
		this.items = items;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
