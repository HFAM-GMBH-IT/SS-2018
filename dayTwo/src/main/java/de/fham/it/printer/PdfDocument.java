package de.fham.it.printer;

import java.awt.PageAttributes;

public class PdfDocument {

    private PageAttributes.MediaType mT;

    public void changeLayout(java.awt.PageAttributes.MediaType aNewLayout) {
        mT = aNewLayout;
    }

    public PageAttributes.MediaType getLayOut() {
        return mT;
    }
}
