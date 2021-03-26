package com.instaget.vendor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// Inventory Belongs to a Store

@Entity
public class Inventory {

	public Inventory() {}
	
	public Inventory(Store store, int itemNumber, String itemDescription, int quantity, double unitCost,
			String image) {
		super();
		this.store = store;
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.unitCost = unitCost;
		this.image = image;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="inventory_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="store_id", nullable=false)
	private Store store;
	
	private int itemNumber;
	private String itemDescription;
	private int quantity;
	private double unitCost;
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", store=" + store + ", itemNumber=" + itemNumber + ", itemDescription="
				+ itemDescription + ", quantity=" + quantity + ", unitCost=" + unitCost + ", image=" + image + "]";
	}
	
	
	
}
