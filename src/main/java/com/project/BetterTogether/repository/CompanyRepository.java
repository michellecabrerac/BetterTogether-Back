package com.project.BetterTogether.repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.project.BetterTogether.model.Company;

import java.util.concurrent.ExecutionException;

public class CompanyRepository implements ICompanyRepository{
    public static final String COL_NAME="Empresas";
    @Override
    public Company getCompany(String cif) throws Exception{
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(cif);
        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        Company company = null;

        if(document.exists()) {
            company = document.toObject(Company.class);
            return company;
        }else {
            return null;
        }
    }

    @Override
    public void saveCompany(Company company) throws Exception {
        // todo - controlar la excepción de manera correcta
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(company.getCif()).set(company);
        // collectionsApiFuture.get().getUpdateTime().toString();
    }
}
