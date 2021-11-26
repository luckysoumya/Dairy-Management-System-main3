package com.cg.dms.service;

import java.util.List;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Dealer;
import com.cg.dms.entities.Farmer;
import com.cg.dms.exception.CompanyNotFoundException;
import com.cg.dms.exception.DealerNotFoundException;
import com.cg.dms.exception.FarmerNotFoundException;

public interface ICompanyService {

	public Company insertCompany(Company company);

	public Company updateCompany(Company company) throws CompanyNotFoundException;

	public Company deleteCompany(int company) throws CompanyNotFoundException;

	public List<Farmer> getAllFormers();

	public List<Dealer> getAllDealers();
	
	public String buyMilk(int dealerId)throws FarmerNotFoundException;

	

}
