package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entities.Companies;
import com.company.entities.Officers;

@Repository
public interface OfficersRepository extends JpaRepository<Officers, String> {

}
