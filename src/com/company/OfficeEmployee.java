package com.company;

public class OfficeEmployee extends Human {
    private String staffId;
    private String department;
    private double salary;

    public OfficeEmployee(String firstName, String lastName, String dateOfBirth, String nativeLanguage, float weight,
                          float height, String staffId, String department, double salary) {
        super(firstName, lastName, dateOfBirth, nativeLanguage, weight, height);
        this.staffId = staffId;
        this.department = department;
        this.salary = salary;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
