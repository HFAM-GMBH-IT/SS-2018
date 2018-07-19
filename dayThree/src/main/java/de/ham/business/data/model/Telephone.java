package de.ham.business.data.model;

public class Telephone {
    private String number;
    private PhoneType phoneType;

    public Telephone(PhoneType thePhoneType, String phoneNumber) {
        phoneType = thePhoneType;
        number = phoneNumber;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "number='" + number + '\'' +
                ", phoneType=" + phoneType +
                '}';
    }
}
