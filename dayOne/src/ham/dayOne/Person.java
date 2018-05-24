
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

public class Person {
    private String name = null;
    private Adresse anschrift;

    public void sayHello() {
        System.out.println(name + " says: Hello");
    }

    public void move(Adresse neueAdresse) {
        anschrift = neueAdresse;
    }

    public String getName() {
        return name;
    }

    private void baptize(String newName) {
        name = newName;
    }

    /**
     * Dieser Konstruktor wird bei dem Erzeugen eines Objekts dieser Klasse aufgerufen.
     * Ist kein Konstruktor explizit deklariert, erzeugt der Compiler einen Default-public-Konstruktor ohne Parameter.
     * Falls kein public-Konstruktor für eine Klasse vorhanden ist, kann von außen kein Objekt dieser Klasser erzeut
     * werden.
     * @param personName
     */
    public Person(String personName) {
        name = personName;
    }

    public String toString() {
        return name + " lives at " + anschrift.toString();
    }
}
