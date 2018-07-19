package de.ham.business.data.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Telephone> phones;
    private BankAccount account;
    private Address address;
    private String name;

    public Person(String theName) {
        name = theName;
        phones = new ArrayList<>();
        account = new BankAccount();
        address = new Address(Address.AddressType.POSTAL, "");
    }

    public void addPhone(Telephone theTelephone) {
        phones.add(theTelephone);
    }

    @Override
    public String toString() {
        return "Person {" +
                "phones=" + phones +
                ", account=" + account +
                ", address=" + address +
                ", name='" + name + '\'' +
                '}';
    }
}
