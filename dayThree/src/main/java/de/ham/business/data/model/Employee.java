package de.ham.business.data.model;

/**
 * Ein Angestellter ist eine Person.
 */
public class Employee extends Person {

    private EmployeeType role;

    /**
     * Erstelle einen neuen Angestellten.
     *
     * @param theRole ist die Rolle des Angestllten
     * @param theName ist der Name des Angestellten
     */
    public Employee(EmployeeType theRole, String theName) {
        super(theName);
        role = theRole;
    }

    /**
     * Nur Angestellte unterscheiden sich in ihrer Rolle; daher ist diese Enumeration auch nur innerhalb dieser Klasse.
     */
    public enum EmployeeType {
        DIRECTOR, MANAGER, WORKER
    }

    /**
     * Die <code>toString()</code>-Methode überschreibt in diesem Fall die <code>toString()</code>-Methode
     * der Klasse <code>Person</code> - und ruft sie mit Hilfe von super.toString() auf um weitere Infoermationen
     * über diesen Angestellten auszugeben.
     * In Java kann man das Überschreiben einer Mehtode mit der Annotation <code>@Override</code> verdeutlichen.
     * @return einen String mit Informationen über diesen Angestellten.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "role=" + role + ", " +
                super.toString() +
                '}';
    }
}
