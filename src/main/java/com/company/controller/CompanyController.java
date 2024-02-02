package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.entities.Companies;
import com.company.service.CompanyService;


@RestController
@RequestMapping("/TrueProxyAPI/rest/Companies/v1")
public class CompanyController {

	@Autowired
	private final CompanyService cs;
	
	public CompanyController(CompanyService cs) {
		super();
		this.cs = cs;
	}


	@GetMapping("/Officers")
	public ResponseEntity<Companies> getDetailsByPath(@RequestParam(value = "CompanyName", required = false) String company_name, @RequestParam(value = "CompanyNumber", required = false) String company_number, @RequestParam(value = "CompanyStatus", required = false) String company_status)
	{
	
		return getDetails(company_name, company_number,company_status);
		
	}
	

	@GetMapping("/getDetails")
	public ResponseEntity<Companies> getDetailsByBody(@RequestBody Companies data)
	{
		return getDetails(data.getCompany_name(), data.getCompany_number(),data.getCompany_status());
	}
	
	public ResponseEntity<Companies> getDetails(String companyname, String companynummber, String companystatus)
	{
		System.out.println(companynummber);
		if(companystatus==null || companystatus=="")
		{
			if((companyname!="") && (companyname!=null) && (companynummber!="") && (companynummber!=null))
				return cs.getDetailsByNumber(companynummber);
			else if(companynummber!=null && companynummber!="")
				return cs.getDetailsByNumber(companynummber);
			else if(companyname!=null && companyname!=null)
				return cs.getDetailsByName(companyname);
			else
			return null;
		}
		else if(companystatus!=null && companystatus!="")
		{
			if((companyname!="") && (companyname!=null) && (companynummber!="") && (companynummber!=null))
				return cs.getDetailsByNumberStatus(companynummber,companystatus);
			else if(companynummber!=null && companynummber!="")
				return cs.getDetailsByNumberStatus(companynummber,companystatus);
			else if(companyname!=null && companyname!=null)
				return cs.getDetailsByNameStatus(companyname,companystatus);
			else
			return null;
		}
		return null;
		
	}
	

}
