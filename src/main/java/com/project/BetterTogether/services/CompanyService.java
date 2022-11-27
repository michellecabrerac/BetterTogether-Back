package com.project.BetterTogether.services;

import com.project.BetterTogether.model.Company;
import com.project.BetterTogether.repository.CompanyRepository;
import com.project.BetterTogether.repository.ICompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService{

    ICompanyRepository companyRepository;

    public CompanyService(){
        //TODO - Por el momento lo dejamos así. Hay que ver como pasar el repo, por si hay un cambio después...
        companyRepository = new CompanyRepository();
    }
    public void saveCompany(Company company) throws Exception {
        companyRepository.saveCompany(company);
    }

    public Company getCompany(String cif) throws Exception{
        return companyRepository.getCompany(cif);
    }



}
