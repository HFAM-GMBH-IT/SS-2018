package de.ham.business.data.model;

import java.util.ArrayList;
import java.util.List;

import static de.ham.business.data.model.PhoneType.FIXED;

public class Company {
    private Telephone phone;
    private BankAccount account;

    /*
     * Wir haben drei Möglichkeiten, die Adressen einer Firma auszudrücken:
     * - als Liste
     * - als Array
     * - individuell; dies wird aber bei großen Mengen unhandlich
     */
    /*
    List<Address> addresses = new ArrayList<>(3);

    Address[] addressArray = new Address[3];
    */

    private Address shippingAddress;
    private Address postalAddress;
    private Address billingAddress;

    private List<Employee> employees;


    public Company() {
        phone = new Telephone(FIXED, "0");
        account = new BankAccount();

        /*
        addresses.add(new Address(Address.AddressType.POSTAL, ""));
        addresses.add(new Address(Address.AddressType.SHIPPING, ""));
        addresses.add(new Address(Address.AddressType.BILLING, ""));

        addressArray[0] = new Address(Address.AddressType.POSTAL, "");
        addressArray[1] = new Address(Address.AddressType.SHIPPING, "");
        addressArray[2] = new Address(Address.AddressType.BILLING, "");
        */

        postalAddress= new Address(Address.AddressType.POSTAL, "");
        shippingAddress = new Address(Address.AddressType.SHIPPING, "");
        billingAddress = new Address(Address.AddressType.BILLING, "");

        employees = new ArrayList<>();
    }

    public void setPostalAddress(Address theAddress) {
        postalAddress = theAddress;
    }

    public void hire(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public void addBankAccount(BankAccount theBankAccount) {
        account = theBankAccount;
    }

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


    public int getCompanySize()  {
        return getEmployees().size();
    }

    List<Employee> getEmployees() {
        if (employees == null) {
            throw new MyException("The attribute employees has not been initialized!");
        }
        return employees;
    }

    public BankAccount getBankAccount() {
        return account;
    }
}
