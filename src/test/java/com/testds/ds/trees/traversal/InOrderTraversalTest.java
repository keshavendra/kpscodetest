package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class InOrderTraversalTest extends TestCase {

    private InOrderTraversal inOrderTraversalObject;

    @Parameterized.Parameter
    public Integer[] treeArray;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new Integer[]{1, 2, 3, 4, 5},
                        Arrays.asList(4, 2, 5, 1, 3)
                },
                {
                        new Integer[]{1, 2, 3, 4, 5, null, null, null, null, null, 6},
                        Arrays.asList(4, 2, 5, 6, 1, 3)
                }
        });
    }

    public static Test suite() {
        return new TestSuite(InOrderTraversalTest.class);
    }

    @Before
    public void setUp() {
        inOrderTraversalObject = spy(new InOrderTraversal());
    }

    @org.junit.Test
    public void testInOrderTraversalWithRecursion() {
        List<Integer> actualResult = inOrderTraversalObject
                .inOrderTraversalWithRecursion(TreeUtils.createTreeFromArray(treeArray));
        Assert.assertEquals(expectedResult, actualResult);
        Mockito.verify(inOrderTraversalObject,
                        Mockito.times(expectedResult.size()))
                .inOrderTraversalWithRecursion(Mockito.any());
    }

    @org.junit.Test
    public void testInOrderTraversalWithoutRecursion() {
        List<Integer> actualResult = inOrderTraversalObject
                .inOrderTraversalWithoutRecursion(TreeUtils.createTreeFromArray(treeArray));
        Assert.assertEquals(expectedResult, actualResult);
        Mockito.verify(inOrderTraversalObject,
                        Mockito.times(1))
                .inOrderTraversalWithoutRecursion(Mockito.any());
    }

    @After
    public void tearDown() {
        inOrderTraversalObject = null;
    }

}
