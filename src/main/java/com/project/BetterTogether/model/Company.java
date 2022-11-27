package com.project.BetterTogether.model;

public class Company {
    private String cif;
    private String nombreEmpresa;

    public Company (){
    }
    public Company (String cif){
        this.cif = cif;
    }

    public String getCif() {
        return this.cif;
    }
    public String setCif(String cif) {
        return this.cif = cif;
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }
    public String setNombreEmpresa(String nombreEmpresa) {
        return this.nombreEmpresa = nombreEmpresa;
    }
/*
    @Override
    public String toString() {
        return "Company{" +
                "cif='" + cif + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                '}';
    }*/
}
