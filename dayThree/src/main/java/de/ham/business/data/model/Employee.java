package de.ham.business.data.model;

public class Employee extends Person {

    private EmployeeType role;

    public Employee(EmployeeType theRole, String theName) {
        super(theName);
        role = theRole;
    }

    public enum EmployeeType {
        DIRECTOR, MANAGER, WORKER
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role=" + role + ", " +
                super.toString() +
                '}';
    }
}
