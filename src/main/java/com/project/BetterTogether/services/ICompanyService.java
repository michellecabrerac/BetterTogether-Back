package com.project.BetterTogether.services;

import com.project.BetterTogether.model.Company;

public interface ICompanyService {
     Company getCompany(String cif) throws Exception;
     void saveCompany(Company company) throws Exception;
}
