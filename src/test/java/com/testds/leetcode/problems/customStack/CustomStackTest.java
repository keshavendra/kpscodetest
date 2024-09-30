package com.testds.leetcode.problems.customStack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CustomStackTest extends TestCase {

    @Parameterized.Parameter
    public String[] commands;

    @Parameterized.Parameter(1)
    public Object[][] parameters;

    @Parameterized.Parameter(2)
    public Object[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"CustomStack", "push", "push", "pop", "push", "push", "push", "increment", "increment", "pop", "pop", "pop", "pop"},
                                new Object[][]{{3}, {1}, {2}, {}, {2}, {3}, {4}, {5, 100}, {2, 100}, {}, {}, {}, {}},
                                new Object[]{null, null, null, 2, null, null, null, null, null, 103, 202, 201, -1}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(CustomStackTest.class);
    }

    @org.junit.Test
    public void testCustomStack() {
        CustomStack customStack = null;
        Object result;
        Object[] actualResult = new Object[commands.length];
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            result = null;
            switch (command) {
                case "CustomStack":
                    customStack = new CustomStack((Integer) parameters[i][0]);
                    break;
                case "push":
                    assert customStack != null;
                    customStack.push((Integer) parameters[i][0]);
                    break;
                case "pop":
                    assert customStack != null;
                    result = customStack.pop();
                    break;
                case "increment":
                    assert customStack != null;
                    customStack.increment((int) parameters[i][0], (int) parameters[i][1]);

            }
            actualResult[i] = result;
        }
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
