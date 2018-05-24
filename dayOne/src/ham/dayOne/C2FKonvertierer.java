
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

/**
 * Diese Klasse hat als Aufgabe, die Umwandelfunktion Fahrenheit zu Zelsius zu implementieren und den umgewandelten Wert
 * auszugeben. Die Funktion lautet c = (f - 32 ) x 5  / 9
 */
public class C2FKonvertierer {
    public static void main(String[] args) {

        // Würden wir f als int deklarieren bekämen wir ganz falsche Ergebnisse.
        double f = Double.valueOf(args[0]);
        double c ;

        c = (f - 32) * 5 / 9;

        // Die Methode System.out.println() nutzen wir, um auf die Konsole zu schreiben
        System.out.println(c);
    }
}
