
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

import java.util.Date;

public class Person {
    private String name = null;
    private Date gebDatum;

    public static class Gender {
        public static String female = "F";
        public static String male = "m";
    }

    public Person() {
        gebDatum = new Date();
    }

    public Person(String personName) {
        name = personName;
        gebDatum = new Date();
    }

    public Person(String personName, Date birthDate) {
        name = personName;
        gebDatum = birthDate;
    }

    public Date getGebDatum() {
        return gebDatum;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Eine Person sagt: Hello.");
    }

    public int caluclateYearsRemaining() {
        return 42;
    }
}
