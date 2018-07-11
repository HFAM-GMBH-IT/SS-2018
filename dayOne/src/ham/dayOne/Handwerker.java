
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

// import-Statements stellen Klassen aus anderen Paketen zur Nutzung zur Verfügung
import java.util.List;

/*
 * Diese Klasse baut auf der Klasse Person auf. Ein Objekt dieser Klasse ist also auch vom Typ Person und man kann sich
 * auch der Methoden aus Person bedienen.
 */
public class Handwerker extends Person {

    List werkzeuge;

    List showTools() {
        return werkzeuge;
    }

    public Handwerker(String name) {
        super(name);
    }

    public void sayHello() {
        int a = 10;
        int s = a + 3;

        double d = 11.9;
        d = d + a;

        System.out.println(getName() + " says: Hello " + a);
    }

}
