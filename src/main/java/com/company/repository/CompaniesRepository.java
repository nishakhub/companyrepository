package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.entities.Companies;


@Repository
public interface CompaniesRepository extends JpaRepository<Companies, String> {

	@Query(nativeQuery = true, value = "SELECT * FROM Companies c where c.company_number=:number")
	Companies findByCompanyNumber(String number);
	
	@Query(nativeQuery = true, value = "SELECT * FROM Companies c where c.company_name=:name ")
	Companies findByCompanyName(String name);
	
	@Query(nativeQuery = true ,value="SELECT * FROM Companies c where c.company_name=:name and c.company_status=:status")
	Companies findByCompanyNameStatus(String name,String status);
	
	
	@Query(nativeQuery = true, value = "SELECT * FROM Companies c where c.company_number=:number and c.company_status=:status")
	Companies findByCompanyNumberStatus(String number, String status);
	
}
