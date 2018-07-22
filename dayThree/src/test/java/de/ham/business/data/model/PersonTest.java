package de.ham.business.data.model;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Auch ganze Klassen und deren Tests können von JUnit ignoriert werden.
 */
@Ignore
public class PersonTest {

    /**
     * Hier steht zwar kein @Ignore aber der Test wird dennoch nicht ausgeführt. @Ignore steht nämlich bei der Klasse.
     */
    @Test
    public void getName() {
        // given
        Person p = new Person("Peter Parker");

        // when
//        String personName = p.getFirstName();

        // then
//        assertEquals("Peter Parker", personName);
    }
}
