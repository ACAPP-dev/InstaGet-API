package com.instaget.vendor.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Vendor {
	public Vendor(String firstName, String lastName, String companyName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		
	}
	
	public Vendor() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vendor_id")
	private int id;
	
	private String firstName;
	private String lastName;
	private String companyName;
	private String email;
	private String password;
	
	// Add links to store table
	@OneToMany
	private List<Store> stores;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Store> getStores() {
		return stores;
	}

//	public void setStore(Store store) {
//		this.store = store;
//	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", companyName="
				+ companyName + ", email=" + email + ", password=" + password + ", store=" + stores + "]";
	}

}

