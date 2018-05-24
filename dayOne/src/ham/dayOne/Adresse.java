
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

public class Adresse {
    // Es ist eine wirklich gute Idee, Felder als "private" zu deklarieren und
    // sie somit dem direkten Zugriff von außen zu entziehen.
    private String street, number;
    private String plz;
    private String city;

    // Der Konstruktor muss nicht alle Felder befüllen.
    // Dieses geht zum Beispiel leer aus. Und erhält einen Default-Wert.
    private boolean isMonumental;

    /**
     * Dieser Konstruktor akzeptiert vier Werte (Argumente) in den folgenden vier Parametern.
     *
     * @param strasse
     * @param number
     * @param code
     * @param stadt
     */
    public Adresse(String strasse, String number, String code, String stadt) {
        street = strasse;
        // Lauten Parameter und Feld gleich, muss dem Kompiler mitgeteilt werden, wie sie zu interpretieren sind.
        // Dazu nutzen wir das Schlüsselwort "this" und markieren somit ein Feld dieser Klasse.
        this.number = number;
        plz = code;
        city = stadt;
    }

    /**
     * Da das Feld plz als "private" markiert ist, kann ein Client nur mit Hilfe sogenannter Getter-Methoden darauf
     * zugreifen. Wir sind frei in der Benamung, sollten aber einer gewissen fachlichen Logik genüge tun.
     * Der Methoden-Name getAngry() wäre also genauso schlecht wie getName(), oder noch schlimmer: getNummer().
     *
     * @return
     */
    public String getCode() {
        return plz;
    }

    /**
     * Oftmals lauten die Getter-Methoden genauso wie das Feld.
     *
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * Als Gegenstück zum Getter gibt es die sogenannten Setter. In der Regel haben sie keinen Rückgabewert.
     * @param newNumber
     */
    public void setNumber(String newNumber) {
        number = newNumber;
    }

    /**
     * Mit Hilfe der toString()-Methode können wir interessante Eigenschaften eines Objekts einfach und gebündelt
     * nach außen geben.
     *
     * @return
     */
    public String toString() {
        String adresseGesamt = " " + street +
                               " " + number +
                               ", " + plz +
                               " " + city;
        return adresseGesamt;
    }
}
