package ham.dayOne;

/**
 * Die <code>Dog</code>-Klasse ist eine sterbliche Lebensform (implementiert also <code>MortalLifeForm</code>) und
 * bietet zusätzlich die Funktionalität des Bellens.
 */
public class Dog implements MortalLifeForm {

    /**
     * Ein Hund kann eine <code>Person</code> anbellen. Leider muss er dann auch jedesmal sein Bein heben und...
     * @param person
     */
    public void barkAt(Person person) {
        System.out.println("The dog barks at " + person.getName());
        person.sayHello();
        pee();
    }

    @Override
    /**
     * Die Methode <code>breathe()</code> nutzt die Funktionalität der <code>Breather</code>-Klasse.
     * @see Duck
     */
    public void breathe() {
        String value = "3";
        Integer a = Integer.valueOf(value);

        if (a == 3) {
            Breather breather = new Rebreather();
            breather.breathe();
        }
    }

    @Override
    /**
     * Ein Hundeleben endet hier sang und klanglos.
     */
    public void die() {

    }

    /**
     * Es gibt Dinge, über die man nicht sprechen sollte.
     */
    private void pee() {
        // ...
    }
}
