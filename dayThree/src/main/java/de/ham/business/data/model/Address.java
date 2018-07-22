package de.ham.business.data.model;

/**
 * Die Adresse. Sie wird mit unterschiedlichen Eigenschaften von Personen oder Firmen genutzt.
 */
public class Address {

    private AddressType typeOfAddress;
    private String address;

    /**
     * Erstelle eine neue Adresse.
     *
     * @param theTypeOfAddress ist der Adresstyp
     * @param theAddress ist die Anschrift
     */
    public Address(AddressType theTypeOfAddress, String theAddress) {
        typeOfAddress = theTypeOfAddress;
        address = theAddress;
    }

    /**
     * Nur die Adresse hat die Notwendigkeit sich zu differenzieren, daher ist dieser Type innerhalb der Adresse.
     */
    public enum AddressType {
        /**
         * postalische Adressen nutzen POSTAL
         */
        POSTAL,
        /**
         * Rechnungsadressen nutzen BILLING
         */
        BILLING,
        /**
         * Lieferadressen nutzen SHIPPING
         */
        SHIPPING
    }

    /**
     * Die <code>toString()</code>-Methode überschreibt
     * die <code>toString()</code>-Methode der Klasse <code>Object</code>.
     * In Java kann man das Überschreiben einer Mehtode mit der Annotation <code>@Override</code> verdeutlichen.
     * @return einen String mit Informationen über diese Adresse.
     */
    @Override
    public String toString() {
        return "Address{" +
                "typeOfAddress=" + typeOfAddress +
                ", address='" + address + '\'' +
                '}';
    }
}
