
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

/*
 * Diese Klasse baut auf der Klasse Person auf. Ein Objekt dieser Klasse ist also auch vom Typ Person und man kann sich
 * auch der Methoden aus Person bedienen.
 */
public class Programmierer extends Person {
    private int linesOfCode;

    public int showLinesOfCode() {
        return linesOfCode;
    }

    public Programmierer(String name) {
        super(name);
    }

    public void sayHello() {
        super.sayHello();
        System.out.println(getName() + " continues his programming work.");
    }
}
