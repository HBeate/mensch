package com.company;

import java.util.ArrayList;
import java.util.List;

//TODO has a Beziehung mit OfficeEmployee
public class Company {
    private String name;
    private String address;
    private List<OfficeEmployee> officeEmployees;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
        this.officeEmployees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<OfficeEmployee> getOfficeEmployees() {
        return officeEmployees;
    }

    public void setOfficeEmployees(List<OfficeEmployee> officeEmployees) {
        this.officeEmployees = officeEmployees;
    }
    public void addOfficeEmployee(OfficeEmployee officeEmployee){
        this.officeEmployees.add(officeEmployee);
    }
    public void printOfficeEmployee(){
        for(OfficeEmployee officeEmployee: this.officeEmployees){
            System.out.println("Office Employees: " + officeEmployee.getFirstName() + " " + officeEmployee.getLastName());
        }
    }

}
