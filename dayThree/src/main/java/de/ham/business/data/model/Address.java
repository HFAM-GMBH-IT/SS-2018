package de.ham.business.data.model;

public class Address {
    // Es ist eine wirklich gute Idee, Felder als "private" zu deklarieren und
    // sie somit dem direkten Zugriff von außen zu entziehen.
    private String street;
    private String number;
    private String postCode;
    private String city;

    // Der Konstruktor muss nicht alle Felder befüllen.
    // Dieses geht zum Beispiel leer aus. Und erhält einen Default-Wert (für boolsche Werte ist dies <code>false</code>).
    private boolean isMonumental;

    /**
     * Dieser Konstruktor akzeptiert vier Werte (Argumente) in den folgenden vier Parametern.
     *
     * @param strasse die Straße der Adresse
     * @param nummer die Hausnummer, evtl. mit Buchstaben
     * @param plz die Postleitzahl
     * @param stadt die Stadt
     */
    public Address(String strasse, String nummer, String plz, String stadt) {
        street = strasse;
        // Lauten Parameter und Feld gleich, muss dem Kompiler mitgeteilt werden, wie sie zu interpretieren sind.
        // Dazu nutzen wir das Schlüsselwort "this" und markieren somit ein Feld dieser Klasse.
        this.number = nummer;
        postCode = plz;
        city = stadt;
    }

    /**
     * Da das Feld postCode als "private" markiert ist, kann ein Client nur mit Hilfe sogenannter Getter-Methoden darauf
     * zugreifen. Wir sind frei in der Benamung, sollten aber einer gewissen fachlichen Logik genüge tun.
     * Der Methoden-Name getAngry() wäre also genauso schlecht wie getName(), oder noch schlimmer: getNummer().
     *
     * @return die Postleitzahl
     */
    public String getCode() {
        return postCode;
    }

    /**
     * Oftmals lauten die Getter-Methoden genauso wie das Feld.
     *
     * @return die Hausnummer
     */
    public String getNumber() {
        return number;
    }

    /**
     * Als Gegenstück zum Getter gibt es die sogenannten Setter. In der Regel haben sie keinen Rückgabewert.
     *
     * @param newNumber die neue Hausnummer
     */
    public void setNumber(String newNumber) {
        number = newNumber;
    }

    /**
     * Ist dies ein Denkmal?
     * @return true im Falle eines Denkmals, ansonsten false
     */
    public boolean isMonumental() {
        return isMonumental;
    }

    /**
     * Manche Immobillien wandeln sich im Laufe der Zeit zu einem Denkmal.
     * @param monumental true im Falle eines Denkmals, ansonsten false
     */
    public void setMonumental(boolean monumental) {
        isMonumental = monumental;
    }

    /**
     * Mit Hilfe der toString()-Methode können wir interessante Eigenschaften eines Objekts einfach und gebündelt
     * nach außen geben.
     *
     * @return eine Menge von Informationen
     */
    public String toString() {
        return " " + street +
                " " + number +
                ", " + postCode +
                " " + city;
    }

}
