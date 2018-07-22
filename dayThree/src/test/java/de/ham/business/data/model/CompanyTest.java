package de.ham.business.data.model;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Diese Klasse enthählt ein UnitTests. Sie ist für die Klasse <code>Company</code> gedacht. Daher hat sie den Namen
 * <code>CompanyTest</code> und ist im gleichen package wie die zu testende Klasse. Somit kann diese Klasse auf
 * sogenannte <code>package-private</code> Eigenschaften der <code>Company</code>-Klasse zugreifen.
 */
public class CompanyTest {

    /**
     * <code>systemUnderTest</code> wird für jeden Test neu erstellt.
     */
    private Company systemUnderTest = new Company();

    /**
     * Mit der Annotation <code>@Test</code> deklarieren wir eine vom JUnit-Framework auszuführende Testmethode.
     */
    @Test
    public void hire() {
        try {
            // given
            Employee director = new Employee(Employee.EmployeeType.DIRECTOR, "Charlie");

            // when
            systemUnderTest.hire(director);

            // then
            assertThat(systemUnderTest.getEmployees().size(), is(1));

            // systemUnderTest = null;

            assertThat(systemUnderTest.getEmployees(), hasItem(director));
        } catch (NullPointerException e) {
            e.printStackTrace();

            Assert.fail("Nee, der Test ging schief!");

            //        } finally {
            //            System.out.println("Test is over, but has it failed?");
        }
    }

    @Test
    public void checkBankAccount() {
        // given

        // when
        BankAccount bankAccount = new BankAccount();
        systemUnderTest.addBankAccount(bankAccount);

        // then
        assertThat(systemUnderTest.getBankAccount(), is(bankAccount));
    }

    /**
     * Diese Testmethode wird ignoriert und nicht von Junit ausgeführt.
     */
    @Test
    @Ignore
    public void ignoreThisTestmethod() throws Exception {
        // given

        // when

        // then

    }

}
