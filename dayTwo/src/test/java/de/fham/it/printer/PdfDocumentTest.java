package de.fham.it.printer;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PdfDocumentTest {

    @Test
    public void changeLayout() {
        // given
        PdfDocument zuTesten = new PdfDocument();
        PageAttributes.MediaType mediaType = PageAttributes.MediaType.A4;

        // when
        zuTesten.changeLayout(mediaType);

        // then
        assertEquals(mediaType, zuTesten.getLayOut());
    }
}
