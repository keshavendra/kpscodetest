package com.testds.leetcode.problems.myQueueUsingStack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MyQueueTest extends TestCase {

    @Parameterized.Parameter
    public String[] operations;

    @Parameterized.Parameter(1)
    public Integer[][] input;

    @Parameterized.Parameter(2)
    public Object[] expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"MyQueue", "push", "push", "peek", "pop", "empty"},
                                new Integer[][]{{}, {1}, {2}, {}, {}, {}},
                                new Object[]{null, null, null, 1, 1, false}
                        }
                }
        );
    }

    public static Test suite() {
        return new TestSuite(MyQueueTest.class);
    }

    @org.junit.Test
    public void testMyQueue() {
        Object[] resultArray = new Object[operations.length];
        MyQueue myQueue = null;
        for (int i = 0; i < operations.length; i++) {
            Object result = null;
            switch (operations[i]) {
                case "MyQueue":
                    myQueue = new MyQueue();
                    break;
                case "push":
                    int x = input[i][0];
                    assert myQueue != null;
                    myQueue.push(x);
                    break;
                case "pop":
                    assert myQueue != null;
                    result = myQueue.pop();
                    break;
                case "peek":
                    assert myQueue != null;
                    result = myQueue.peek();
                    break;
                case "empty":
                    assert myQueue != null;
                    result = myQueue.empty();
            }
            resultArray[i] = result;
        }
        Assert.assertArrayEquals(expectedResult, resultArray);
    }

}
