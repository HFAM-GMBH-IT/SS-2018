package de.ham.business.data.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getName() {
        // given
        Person p = new Person("Peter Parker");

        // when
        String personName = p.getName();

        // then
        assertEquals("Peter Parker", personName);
    }
}
