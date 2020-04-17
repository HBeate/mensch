package com.company;

public class Human {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nativeLanguage;
    private float weight;
    private float height;

    public Human(String firstName, String lastName, String dateOfBirth, String nativeLanguage, float weight, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nativeLanguage = nativeLanguage;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void communicate() {
        System.out.println("I speak " + this.nativeLanguage);
    }

    public void printDataSheet() {
        System.out.println("DATA SHEET \nVorname: " + firstName + "\nNachname: " + lastName + "\nGeburtsdatum: " + dateOfBirth +
                "\nMuttersparache: " + nativeLanguage);
    }
}
