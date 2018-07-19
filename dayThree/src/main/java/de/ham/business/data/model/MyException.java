package de.ham.business.data.model;

public class MyException extends RuntimeException {
    public MyException(String reason) {
        super(reason);
    }
}
