package de.fham.it.printer;

public class Printer {

    public void print(TextDocument aDocument) {
        System.out.println("I am printing a text document");
    }

    public void print(PdfDocument aDocument) {
        System.out.println("I am printing a pdf document");
    }

    public void print(WordDocument aDocument) {
        System.out.println("I am on a Mac and can't print a word document");

    }

    public void print(PagesDocument aDocument) {
        System.out.println("I am printing a text document");
    }
}
