package com.testds.leetcode.problems.randomizedSet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RandomizedSetTest extends TestCase {

    private RandomizedSet randomizedSet = new RandomizedSet();

    @Parameterized.Parameter
    public String[] method;

    @Parameterized.Parameter(1)
    public Integer[][] input;

    @Parameterized.Parameter(2)
    public Object[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"},
                                new Integer[][]{{}, {1}, {2}, {2}, {}, {1}, {2}, {}},
                                new Object[]{null, true, false, true, 2, true, false, 2}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(RandomizedSetTest.class);
    }

    @org.junit.Test
    public void testRandomizedSet() {
        Object[] actualResult = new Object[method.length];
        for (int i = 0; i < method.length; i++) {
            Object result = null;
            switch (method[i]) {
                case "RandomizedSet":
                    randomizedSet = new RandomizedSet();
                    break;
                case "insert":
                    result = randomizedSet.insert(input[i][0]);
                    break;
                case "remove":
                    result = randomizedSet.remove(input[i][0]);
                    break;
                case "getRandom":
                    result = randomizedSet.getRandom();
            }
            actualResult[i] = result;
        }
        for (int i = 0; i < method.length; i++) {
            if (!"getRandom".equals(method[i])) {
                assertEquals(expectedResult[i], actualResult[i]);
            } else {
                assertNotNull(actualResult[i]);
            }
        }
    }
}
