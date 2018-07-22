package de.ham.business.data.model;

import java.util.UUID;

/**
 * Ein Bankkonto. Es besitzt eine Nummer.
 */
public class BankAccount {
    private String accountNumber;

    /**
     * Erstelle ein neues Bankkonto mit einer eineindeutigen Kontonummer.
     */
    public BankAccount() {
        accountNumber = UUID.randomUUID().toString();
    }

    /**
     * Die <code>toString()</code>-Methode überschreibt
     * die <code>toString()</code>-Methode der Klasse <code>Object</code>.
     * In Java kann man das Überschreiben einer Mehtode mit der Annotation <code>@Override</code> verdeutlichen.
     * @return einen String mit Informationen über dieses Bankkonto.
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
