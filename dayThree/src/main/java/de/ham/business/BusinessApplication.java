package de.ham.business;

import de.ham.business.data.model.*;
import static de.ham.business.data.model.Address.AddressType.POSTAL;
import static de.ham.business.data.model.PhoneType.FIXED;
import static de.ham.business.data.model.PhoneType.MOBILE;

public class BusinessApplication {

    public static void main(String[] args) {
        Company surfAndTurf = new Company();

        surfAndTurf.setPostalAddress(
                new Address(POSTAL, "the beach front, Miami")
        );

        Employee director = new Employee(Employee.EmployeeType.DIRECTOR, "Charlie");
        surfAndTurf.hire(director);
        director.addPhone(new Telephone(MOBILE, "0171-10000-000"));
        director.addPhone(new Telephone(FIXED, "089-10000-000"));

        surfAndTurf.hire(new Employee(Employee.EmployeeType.MANAGER, "Mary"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.MANAGER, "Elon"));

        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Peter"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Paul"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Margot"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Martin"));
        surfAndTurf.hire(new Employee(Employee.EmployeeType.WORKER, "Mary"));

        surfAndTurf.addBankAccount(new BankAccount());

        System.out.println("The company has " + surfAndTurf.getCompanySize() + " employees.");
        System.out.println(surfAndTurf);
    }

}
