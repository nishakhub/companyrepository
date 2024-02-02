package com.company.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="officers")
public class Officers {

	
	@Id
	private String officer_id;
	
	@ManyToOne
	@JoinColumn(name="company_number")
	private Companies company_number;
	
	@OneToMany(mappedBy="office")
	private List<OfficersAddress> address = new ArrayList<OfficersAddress>();
	
	private String officer_name;
	
	private String officer_role;
	
	private String appointed_on;
	
	private String resigned_on;

	

	
	
	public Officers(String officer_id, List<OfficersAddress> address, String officer_name, String officer_role,
			String appointed_on) {
		super();
		this.officer_id = officer_id;
		this.address = address;
		this.officer_name = officer_name;
		this.officer_role = officer_role;
		this.appointed_on = appointed_on;
	}



	public Officers() {
		super();
		// TODO Auto-generated constructor stub
	}



	public List<OfficersAddress> getAddress() {
		return address;
	}



	public void setAddress(List<OfficersAddress> address) {
		this.address = address;
	}



	public String getOfficer_id() {
		return officer_id;
	}

	public void setOfficer_id(String officer_id) {
		this.officer_id = officer_id;
	}

	public String getOfficer_name() {
		return officer_name;
	}

	public void setOfficer_name(String officer_name) {
		this.officer_name = officer_name;
	}

	public String getOfficer_role() {
		return officer_role;
	}

	public void setOfficer_role(String officer_role) {
		this.officer_role = officer_role;
	}

	public String getAppointed_on() {
		return appointed_on;
	}

	public void setAppointed_on(String appointed_on) {
		this.appointed_on = appointed_on;
	}
	
	
}
