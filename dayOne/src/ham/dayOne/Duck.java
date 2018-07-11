package ham.dayOne;

/**
 * Die <code>Duck</code>-Klasse ist eine Lebensform (implementiert also <code>LifeForm</code>), die fliegen kann
 * (implementiert also <code>Flyable</code>).
 */

public class Duck implements Lifeform, Flyable {
    @Override
    /**
     * Die Methode <code>breathe()</code> nutzt die Funktionalität der <code>Breather</code>-Klasse.
     * @see Dog
     */
    public void breathe() {
        new Breather().breathe();
    }

    @Override
    /**
     * so sieht fliegen aus
     */
    public void fly() {
        System.out.println("I am freeeeee!");
    }
}
