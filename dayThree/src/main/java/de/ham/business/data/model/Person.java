package de.ham.business.data.model;

import java.util.Date;

public class Person {
    private String name = null;
    private Date dateOfBirth;
    private Gender sex;

    public static class Gender {
        public static String female = "F";
        public static String male = "m";
    }

    public Person() {
        dateOfBirth = new Date();
    }

    public Person(String personName) {
        name = personName;
        dateOfBirth = new Date();
    }

    public Person(String personName, Date birthDate) {
        name = personName;
        dateOfBirth = birthDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Eine Person sagt: Hello.");
    }

    public int caluclateYearsRemaining() {
        return 42;
    }
}
