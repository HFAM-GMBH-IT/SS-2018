
/*
 * Das package-Statement entpricht der Verzeichnisstruktur in der diese Klasse liegt.
 * Sie hilft meherere Klassen logisch zusammenzufassen, z.B. aufgrund ihrer Funktionalität.
 */
package ham.dayOne;

public class Hauptprogramm {
    public static void main(String[] args) {

        Dog wuschi = new Dog();
        wuschi.breathe();

        Duck donald = new Duck();
        donald.breathe();

        Duck daisy = new Duck();

        Plane chesnut = new Plane();

        Person person = new Handwerker("Fred");
        if (Person.Gender.female.equals("F")) {
            // ...
        }

        person.sayHello();
        wuschi.barkAt(person);

        takeOff(donald);
        takeOff(daisy);
        takeOff(chesnut);
    }

    public static void takeOff(Flyable flyer) {
        flyer.fly();
    }

}
