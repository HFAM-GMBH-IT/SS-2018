package de.ham.business.data.model;

public class BankAccount {
    private String accountNumber;

    public BankAccount() {
        accountNumber = "hello";
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
