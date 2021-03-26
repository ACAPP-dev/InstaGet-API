package com.instaget.vendor.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

// Store belongs to a Vendor

@Entity
public class Store {
	
	public Store(String storeName, String storeType, Vendor vendor) {
		super();
		this.storeName = storeName;
		this.storeType = storeType;
		this.vendor = vendor;
	}

	public Store() {}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="store_id")
	private int id;
	
	private String storeName;
	private String storeType;
	
	@OneToMany
	private List<Inventory> inventory;

	@ManyToOne
	@JoinColumn(name="vendor_id")
	private Vendor vendor;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public List<Inventory> getInventory() {
		return inventory;
	}

//	public void setInventory(Inventory inventory) {
//		this.inventory = inventory;
//	}


	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storeName=" + storeName + ", storeType=" + storeType + ", inventory=" + inventory
				+ ", vendor=" + vendor + "]";
	}
	
	
}

