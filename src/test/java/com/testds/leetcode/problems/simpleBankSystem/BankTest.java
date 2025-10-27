package com.testds.leetcode.problems.simpleBankSystem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BankTest extends TestCase {

    private Bank bank;

    @Parameterized.Parameter
    public String[] operations;

    @Parameterized.Parameter(1)
    public Object[][] parameters;

    @Parameterized.Parameter(2)
    public Object[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"},
                                new Object[][]{{new long[]{10, 100, 20, 50, 30}}, {3, 10}, {5, 1, 20}, {5, 20}, {3, 4, 15}, {10, 50}},
                                new Object[]{null, true, true, true, false, false}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(BankTest.class);
    }

    @org.junit.Test
    public void testBankApp() {
        Object[] actualResult = new Object[operations.length];
        for (int index = 0; index < operations.length; index++) {
            String operation = operations[index];
            String result = null;
            switch (operation) {
                case "Bank":
                    bank = new Bank((long[]) parameters[index][0]);
                    break;
                case "withdraw":
                    result = String.valueOf(bank.withdraw((Integer) parameters[index][0], (Integer) parameters[index][1]));
                    break;
                case "transfer":
                    result = String.valueOf(bank.transfer((Integer) parameters[index][0], (Integer) parameters[index][1], (int) parameters[index][2]));
                    break;
                case "deposit":
                    result = String.valueOf(bank.deposit((Integer) parameters[index][0], (Integer) parameters[index][1]));
            }
            actualResult[index] = result == null ? null : Boolean.valueOf(result);
        }
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
