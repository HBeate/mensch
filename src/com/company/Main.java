package com.company;
/*   Versucht folgende Vererbung abzubilden:

    Torwart || Sportler || Fußballer || Mensch || Stürmer || Büroangestellter
    Es gibt noch zwei weitere Klassen, nämlich einen Verein und eine Firma, welche auf entsprechender Ebene eine Zuordnung finden sollten.
    Findet Englische Begriffe dafür
    Überlegt euch in welcher Reihenfolge die Vererbung hier stattfinden kann
    Findet je Klasse zwei sinnvolle Eigenschaften und Methoden
    Achtet auf private/public */

public class Main {

    public static void main(String[] args) {
        OfficeEmployee employee1 = new OfficeEmployee("Max", "Muster", "01.01.2001",
                "English", 70, 180, "12345", "Accounting", 70000);
        OfficeEmployee employee2 = new OfficeEmployee("Sara", "Müller", "02.02.2002",
                "German", 50, 160, "54321", "Sales", 80000);

        Company company1 = new Company("Meier Optik", "Stadtstrasse 11");
        company1.addOfficeEmployee(employee1);
        company1.addOfficeEmployee(employee2);
        company1.printOfficeEmployee();

        Human person1 = new Human("Lukas", "Hauser", "24.04.2011", "German",
                30, 133);
        person1.printDataSheet();
        Athlete athlete1 = new Athlete("Alina", "Hauser", "24.05.2006", "English",
                48, 155, "Badmington", "Beginner");
    }

}
