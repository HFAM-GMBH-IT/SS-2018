package de.ham.business.data.model;

public class Address {

    private AddressType typeOfAddress;
    private String address;

    public Address(AddressType theTypeOfAddress, String theAddress) {
        typeOfAddress = theTypeOfAddress;
        address = theAddress;
    }


    public enum AddressType {
        POSTAL, BILLING, SHIPPING
    }

    @Override
    public String toString() {
        return "Address{" +
                "typeOfAddress=" + typeOfAddress +
                ", address='" + address + '\'' +
                '}';
    }
}
