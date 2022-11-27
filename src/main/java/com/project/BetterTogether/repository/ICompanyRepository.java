package com.project.BetterTogether.repository;

import com.project.BetterTogether.model.Company;

import java.util.concurrent.ExecutionException;

public interface ICompanyRepository {
    Company getCompany(String cif) throws Exception;
    void saveCompany(Company company) throws Exception;
}
