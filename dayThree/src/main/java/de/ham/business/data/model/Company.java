package de.ham.business.data.model;

import java.util.ArrayList;
import java.util.List;

import static de.ham.business.data.model.PhoneType.FIXED;

/**
 * Die Klasse <code>Company</code> repräsentiert eine Firma und hat:</br>
 * <ul>
 *     <li>ein Telefon</li>
 *     <li>ein Bankkonto</li>
 *     <li>eine postalische Adresse</li>
 *     <li>eine Lieferadress</li>
 *     <li>eine Rechnungsadresse</li>
 *     <li>eine Liste von Angestellten</li>
 * </ul>
 */
public class Company {
    private Telephone phone;
    private BankAccount account;

    /**
     * Wir haben drei Möglichkeiten, die Adressen dieser Firma zu implementieren:</br>
     * <ul>
     *     <li><als Liste</li>
     *     <li>als Array</li>
     *     <li>individuell; dies wird aber bei großen Mengen unhandlich</li>
     * </ul>
     *
     * Bei Listen als auch bei Arrays haben wir die Möglichkeit initial eine Größe anzugeben.
     * <pre>
     * List< Address> addresses = new ArrayList<>(3);
     * Address[] addressArray = new Address[3];
     * </pre>
     *
     * Hier entschließen wir uns für die dritte Möglichkeit, der individuellen Version.
     */
    private Address shippingAddress;
    private Address postalAddress;
    private Address billingAddress;

    /**
     * Die Angestellten werden als Liste dargestellt.
     */
    private List<Employee> employees;


    public Company() {
        phone = new Telephone(FIXED, "0");
        account = new BankAccount();

        /**
         * Das Hinzufügen von Adressen geschieht bei beiden Implementierungsmöglichkeiten ähnlich.
         *
         *
         * addresses.add(new Address(Address.AddressType.POSTAL, ""));
         * addresses.add(new Address(Address.AddressType.SHIPPING, ""));
         * addresses.add(new Address(Address.AddressType.BILLING, ""));
         *
         * addressArray[0] = new Address(Address.AddressType.POSTAL, "");
         * addressArray[1] = new Address(Address.AddressType.SHIPPING, "");
         * addressArray[2] = new Address(Address.AddressType.BILLING, "");
         */

        postalAddress= new Address(Address.AddressType.POSTAL, "");
        shippingAddress = new Address(Address.AddressType.SHIPPING, "");
        billingAddress = new Address(Address.AddressType.BILLING, "");

        employees = new ArrayList<>();
    }

    /**
     * Setzt die postalische Adresse.
     *
     * @param theAddress ist die neue postalische Adresse
     */
     // TODO prüfe, ob die Adresse wirklich vom Typ POSTAL ist
    public void setPostalAddress(Address theAddress) {
        postalAddress = theAddress;
    }

    /**
     * Firmen stellen neue Angestellte ein.
     *
     * @param newEmployee ist der neue Angestellte
     */
    // TODO eigentlich sollten Firmen Personen einstellen, die dann Angestellte werden
    public void hire(Employee newEmployee) {
        employees.add(newEmployee);
    }

    /**
     * Ein neues Konto für die Firma.
     *
     * @param theBankAccount das neue Bankkonto
     */
    // TODO das sollte nicht addBankAccount() sondern setBankAccount sein
    public void addBankAccount(BankAccount theBankAccount) {
        account = theBankAccount;
    }

    /**
     * Die <code>toString()</code>-Methode überschreibt
     * die <code>toString()</code>-Methode der Klasse <code>Object</code>.
     * In Java kann man das Überschreiben einer Mehtode mit der Annotation <code>@Override</code> verdeutlichen.
     *
     * @return einen String mit Informationen über diese Firma.
     */
    @Override
    public String toString() {
        return "Company{" +
                "phone=" + phone +
                ", account=" + account +
                ", shippingAddress=" + shippingAddress +
                ", postalAddress=" + postalAddress +
                ", billingAddress=" + billingAddress +
                ", employees=" + employees +
                '}';
    }

    /**
     * Eine Firma will nicht ihre Angestellten preisgeben, daher ist die Methode <code>getEmployees()</code>
     * nicht public. Sie ist aber auch weder protected noch private damit sie problemlos von Klassen im gleichen
     * Package aufgerufen werden kann, z.B. von Tests...
     *
     * @return eine Liste mit Angestellten
     */
    List<Employee> getEmployees() {
        if (employees == null) {
            throw new MyException("The attribute employees has not been initialized!");
        }
        return employees;
    }

    /**
     * Diese Firma gibt aber gerne die Anzahl der Mitarbeiter preis.
     *
     * @return Anzahl der Mitarbeiter
     */
    public int getCompanySize()  {
        return getEmployees().size();
    }

    /**
     * Diese Firma hofft auf Einnahmen und gibt daher ihr Bankkonto preis.
     *
     * @return das Bankkonto
     */
    public BankAccount getBankAccount() {
        return account;
    }
}
