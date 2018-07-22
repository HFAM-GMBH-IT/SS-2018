package de.ham.business.data.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Eine Person besitzt mehrere Telefone, eine Bankkonto, eine Adresse und natürlich einen Namen.
 */
public class Person {
    private List<Telephone> phones;
    private BankAccount account;
    private Address address;
    private String name;

    /**
     * Erstelle eine neue Person.
     *
     * @param theName ist der Name der neuen Person
     */
    public Person(String theName) {
        name = theName;
        phones = new ArrayList<>();
        account = new BankAccount();
        address = new Address(Address.AddressType.POSTAL, "");
    }

    /**
     * Füge ein Telefon der Person hinzu.
     *
     * @param theTelephone ist das neue Telefon
     */
    public void addPhone(Telephone theTelephone) {
        phones.add(theTelephone);
    }

    /**
     * Die <code>toString()</code>-Methode überschreibt
     * die <code>toString()</code>-Methode der Klasse <code>Object</code>.
     * In Java kann man das Überschreiben einer Mehtode mit der Annotation <code>@Override</code> verdeutlichen.
     * @return einen String mit Informationen über diese Person.
     */
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
