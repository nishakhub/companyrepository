package com.company.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;



@Entity
@Table(name="companies")
public class Companies {

	@Id
	private String company_number;
	
	@Column
	private String company_name;
	
	@Column
	private String company_type;
	
	@Column
	private String company_status;
	
	@Column
	private String data_of_creation;
	
	@OneToMany(mappedBy="company", cascade = CascadeType.ALL)
	private List<CompanyAddress> addressList = new ArrayList<CompanyAddress>();
	
	@OneToMany(mappedBy="company_number",targetEntity = Officers.class, cascade = CascadeType.ALL)
	private List<Officers> officers = new ArrayList<Officers>();


	public Companies(String company_number, String company_name, String company_type, String company_status,
			String data_of_creation, List<CompanyAddress> addressList, List<Officers> officers) {
		super();
		this.company_number = company_number;
		this.company_name = company_name;
		this.company_type = company_type;
		this.company_status = company_status;
		this.data_of_creation = data_of_creation;
		this.addressList = addressList;
		this.officers = officers;
	}



	public Companies() {
		super();
		// TODO Auto-generated constructor stub
	}



	public List<CompanyAddress> getAddressList() {
		return addressList;
	}



	public void setAddressList(List<CompanyAddress> addressList) {
		this.addressList = addressList;
	}



	public List<Officers> getOfficers() {
		return officers;
	}



	public void setOfficers(List<Officers> officers) {
		this.officers = officers;
	}



	public String getCompany_number() {
		return company_number;
	}

	public void setCompany_number(String company_number) {
		this.company_number = company_number;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_type() {
		return company_type;
	}

	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}

	public String getCompany_status() {
		return company_status;
	}

	public void setCompany_status(String company_status) {
		this.company_status = company_status;
	}

	public String getDate_of_creation() {
		return data_of_creation;
	}

	public void setDate_of_creation(String date_of_creation) {
		this.data_of_creation = date_of_creation;
	}
	
	
	
}
