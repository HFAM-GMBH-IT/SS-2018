package de.ham.business;

import de.ham.business.data.model.*;
import static de.ham.business.data.model.Address.AddressType.POSTAL;
import static de.ham.business.data.model.PhoneType.FIXED;
import static de.ham.business.data.model.PhoneType.MOBILE;

/**
 * Dies ist unser Hauptprogramm; hier erstllen wir eine Firma.
 */
public class BusinessApplication {

    public static void main(String[] args) {
        Company surfAndTurf = new Company();

        surfAndTurf.setPostalAddress(
                new Address(POSTAL, "the beach front, Miami")
        );

        /**
         * Erstelle den neuen Chef.
         */
        Employee director = new Employee(Employee.EmployeeType.DIRECTOR, "Charlie");
        surfAndTurf.hire(director);
        /**
         * Er bekommt direkt zwei Telefone gestellt.
         */
        director.addPhone(new Telephone(MOBILE, "0171-10000-000"));
        director.addPhone(new Telephone(FIXED, "089-10000-000"));

        /**
         * Füge zwei Manager der Firma hinzu.
         */
        surfAndTurf.hire(new Employee(Employee.EmployeeType.MANAGER, "Mary"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.MANAGER, "Elon"));

        /**
         * Und fünf Untergebene.
         */
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Peter"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Paul"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Margot"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Martin"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Mary"));

        /**
         * Die Firma erwartet monetäre Transaktionen und benötigt ein Bankkonto.
         */
        surfAndTurf.addBankAccount(new BankAccount());

        /**
         * Zeig die Firma und alles was sie besitzt.
         */
        System.out.println("The company has " + surfAndTurf.getCompanySize() + " employees.");
        System.out.println(surfAndTurf);
    }

}
