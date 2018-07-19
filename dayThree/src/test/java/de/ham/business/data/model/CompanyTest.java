package de.ham.business.data.model;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;
import org.junit.Test;

public class CompanyTest {

    private Company systemUnderTest = new Company();

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
    @Ignore
    public void checkBankAccount() {
        // given

        // when
        BankAccount bankAccount = new BankAccount();
        systemUnderTest.addBankAccount(bankAccount);

        // then
        assertThat(systemUnderTest.getBankAccount(), is(bankAccount));
    }
}
