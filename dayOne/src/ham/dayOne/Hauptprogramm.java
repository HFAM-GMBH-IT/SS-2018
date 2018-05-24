
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

public class Hauptprogramm {
    public static void main(String[] args) {
        /*
         * Hier erzeugen wir eine Objekt der Klasse Person.
         * Gleichzeitig übergeben wir das Argument "spiderman" dem sogennanten Konstruktor.
         * Dieser befüllt damit das Feld "name" des Personenobjekts.
         */
        Person peterParker = new Person("spiderman");

        /*
         * Hier erzeugen wir ein Objekt der Klasse Adresse.
         * Gleichzeitig übergeben wir dem Konstruktor als Argumente die ersten beiden Werte des Programmaufrufs
         * (diese stecken ja in dem Parameterarray "args") als auch "86161" und "Augsburg".
         * Der Konstruktor wird damit die Felder "street", "number", "code" und "stadt" befüllen.
         */
        Adresse neueAdresse = new Adresse(
                args[1],
                args[0],
                "86161",
                "Augsburg"
        );

        /* Nun lassen wir peterParker umziehen. Wir übergeben dem Objekt peterParker das Objekt der neuen Adresse
         * (als Referenz mit Hilfe der Variablen "neueAdresse") indem wir die Methode move() aufrufen. Diese ist
         * definiert in der Person-Klasse.
         */
        peterParker.move(neueAdresse);

        /*
        * Hier wird die Methode toString() auf dem Objekt peterParker aufgerufen. Ist diese nicht in der Klasse Person
        * definiert, wird die der (verwirrend benamten) Klasse "Objekt" aufgerufen. Diese default-Implementierung
        * liefert einen String der als Inhalt den Namen der Klasse hat gefolgt von einem Klammeräffchen und der
        * Speicheradresse des Objekts.
        */
        System.out.println(peterParker.toString());

        /*
         * Hier rufen wir eine Methode dieser Klasse (Hauptprogramm auf). Sie muss als "static" declariert sein, da
         * diese Methode (main) auch "static" ist.
         */
        letTheCrowdCheer();

        peterParker.sayHello();

        int i = 0;
        // loopWithAWhileLoop(i)
        // loopWithADoWhileLoop(i)
        // loopWithAForLoop(i)

        while (true) { // wiederhole wahrscheinlich für immer

            if (i == 5) {
                break; // oh, doch nicht; beim sechsten mal verlassen wir die Schleife
            }
            if (i == 4) { // beim fünften mal passiert etwas besonderes - Mist! hier steht aber 4?!?
                System.out.print(i + ": The crowd falters.");
            } else {
                System.out.print(i + ": ");
                letTheCrowdCheer();
            }

            i++; // ah, wenn wir vor den IFs inkrementiert hätten, dann müssten wir in den Zeilen 50 & 53 nicht denken
        }

        /*
         * Hier könnten wir peterParker umziehen lassen, da wir noch direkten Zugriff auf seine Adresse haben!
         * Abhilfe schaffen "immutable objects". Sehr beliebt in der Programmiersprache Scala - aus genau diesem Grund.
         */
        // neueAdresse.setNumber("4c");
        // System.out.println(peterParker.toString());
    }

    public static void letTheCrowdCheer() {
        System.out.println("The crowd cheers!");
    }

    private static void loopWithAWhileLoop(int i) {
        while (i < 5) {
            i++;
            // hier passiert etwas großartiges wahrscheinlich fünf mal
        }
    }

    private static void loopWithADoWhileLoop(int i) {
        do {
            // hier passiert etwas großartiges wahrscheinlich fünf mal, aber mindestens ein Mal
        } while (i < 5);
    }

    private static void loopWithAForLoop(int i) {
        for (; i < 5; i++) {
            // hier passiert etwas großartiges wahrscheinlich fünf mal
        }
    }
}
