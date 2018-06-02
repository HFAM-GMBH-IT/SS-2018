package de.fham.it;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void check42() throws Exception {
        // given
        App application = new App();

        // when
        int result = application.getValue(42);

        // then
        assertEquals(42, result);
    }

    @Test
    public void check27() throws Exception {
        // given
        App application = new App();

        // when
        int result = application.getValue(27);

        // then
        assertEquals(27, result);
    }

    @Test
    public void checkAny() throws Exception {
        // given
        App application = new App();

        // when
        int result = application.getValue(57);

        // then
        assertEquals(57, result);
    }

    @Test
    public void checkRandom() throws Exception {
        // given
        App application = new App();

        Random r = new Random();
        for (int i = 0; i < 150; i++) {
            int value = r.nextInt();
            int result = application.getValue(value);
            assertEquals(value, result);
        }
    }

    public void diesIstKeinTest() {
        // ... wird nicht als Test ausgefuhrt
    }

}
