package com.company.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="officers_address")
public class OfficersAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int address_id;
	
	@ManyToOne
	@JoinColumn(name="officer_id")
	private Officers office;
	
	private String premises;
	
	private String locality;
	
	private String address_line_1;
	
	private String country;
	
	private String postal_code;

	public String getPremises() {
		return premises;
	}

	public void setPremises(String premises) {
		this.premises = premises;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public OfficersAddress(String premises, String locality, String address_line_1, String country,
			String postal_code) {
		super();
		this.premises = premises;
		this.locality = locality;
		this.address_line_1 = address_line_1;
		this.country = country;
		this.postal_code = postal_code;
	}

	public OfficersAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}