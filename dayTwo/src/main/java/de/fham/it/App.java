package de.fham.it;

import java.awt.*;

import de.fham.it.printer.PdfDocument;
import de.fham.it.printer.Printer;
import de.fham.it.printer.WordDocument;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Printer coolerMacPrinter = new Printer();

        PdfDocument niceDocument = new PdfDocument();
        niceDocument.changeLayout(PageAttributes.MediaType.A4);

        coolerMacPrinter.print(niceDocument);

        WordDocument wordDocument = new WordDocument();
        coolerMacPrinter.print(wordDocument);
    }

    public int getValue(int value) {
        return value;
    }
}
