package com.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.company.entities.Companies;
import com.company.entities.Officers;
import com.company.repository.CompaniesRepository;



@Service
public class CompanyService {

	@Autowired
	private final CompaniesRepository companiesrepository;
	
	public CompanyService(CompaniesRepository companiesrepository) {
		super();
		this.companiesrepository = companiesrepository;
	}

	public ResponseEntity<Companies> getDetailsByName(String name)
	{
		Companies c = companiesrepository.findByCompanyName(name);
		if(c==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(c);
		
	}
	
	public ResponseEntity<Companies> getDetailsByNumber(String number)
	{
		Companies c = companiesrepository.findByCompanyNumber(number);
		if(c==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(c);
	}
	
	public ResponseEntity<Companies> getDetailsByNameStatus(String name, String companystatus)
	{
		System.out.println("Inside target");
		Companies c = companiesrepository.findByCompanyNameStatus(name, companystatus);
		if(c==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(c);
	}
	
	public ResponseEntity<Companies> getDetailsByNumberStatus(String number, String companystatus)
	{
		Companies c = companiesrepository.findByCompanyNumberStatus(number, companystatus);
		if(c==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(c);
	}
	
}
	
	
