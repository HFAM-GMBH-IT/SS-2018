package de.ham.business.data.model;

/**
 * Hiermit erstellen wir eine neue Ausnahme, die von Methoden an ihre aufrufenden Methoden mittels <code>throw</code>
 * übergeben wird.
 * Diese Exception leitet von <code>RuntimeException</code> ab und muss somit nicht in der Signatur einer Methode
 * angegeben werden.
 */
public class MyException extends RuntimeException {
    public MyException(String reason) {
        super(reason);
    }
}
