package com.project.BetterTogether.controllers;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.BetterTogether.model.Company;
import com.project.BetterTogether.services.CompanyService;

@RestController
public class CompanyController {
        @Autowired
        CompanyService companyService;

        @GetMapping("/getCompany")
        public Company getCompany(@RequestParam(value = "cif") String cif) throws Exception{
            return companyService.getCompany(cif);
        }
        @PostMapping("/postCompany")
        public void saveCompany(@RequestParam(value = "cif") String cif) throws Exception{
             companyService.saveCompany(new Company(cif));
        }

}
