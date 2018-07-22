package de.ham.business.data.model;

/**
 * Ein Telefon. Es hat eine Nummer und ist von einem bestimmten Typ.
 */
public class Telephone {
    private String number;
    private PhoneType phoneType;

    /**
     * Erstelle ein neues Telefon.
     *
     * @param thePhoneType ist der Typ des Telefons
     * @param phoneNumber ist die Telefonnummer
     */
    public Telephone(PhoneType thePhoneType, String phoneNumber) {
        phoneType = thePhoneType;
        number = phoneNumber;
    }

    /**
     * Die <code>toString()</code>-Methode überschreibt
     * die <code>toString()</code>-Methode der Klasse <code>Object</code>.
     * In Java kann man das Überschreiben einer Mehtode mit der Annotation <code>@Override</code> verdeutlichen.
     *
     * @return einen String mit Informationen über dieses Telefon.
     */
    @Override
    public String toString() {
        return "Telephone{" +
                "number='" + number + '\'' +
                ", phoneType=" + phoneType +
                '}';
    }
}
