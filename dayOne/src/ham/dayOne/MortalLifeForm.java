package ham.dayOne;

/**
 * Eine sterbliche Lebensform ist eine Lebensform (erweitert also <code>LifeForm</code>), die sterben kann.
 */
public interface MortalLifeForm extends Lifeform {
    /**
     * stirb
     */
    void die();
}
