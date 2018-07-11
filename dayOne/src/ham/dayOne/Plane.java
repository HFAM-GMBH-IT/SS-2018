package ham.dayOne;

/**
 * Ein Flugzeug kann auch fliegen und implementiert also die <code>Flyable</code>-Schnittstelle.
 */
public class Plane implements Flyable {
    @Override
    /**
     * So sieht fliegen aus.
     */
    public void fly() {
        System.out.println("My engines are roaring!");
    }
}
