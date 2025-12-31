package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class PreOrderTraversalTest extends TestCase {

    private PreOrderTraversal preOrderTraversalObject;

    @Parameterized.Parameter
    public Integer[] treeArray;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new Integer[]{1, 2, 3, 4, 5},
                        Arrays.asList(1, 2, 4, 5, 3)
                },
                {
                        new Integer[]{1, 2, 3, 4, 5, null, null, null, null, null, 6},
                        Arrays.asList(1, 2, 4, 5, 6, 3)
                }
        });
    }

    public static Test suite() {
        return new TestSuite(PreOrderTraversalTest.class);
    }

    @Before
    public void setUp() {
        preOrderTraversalObject = spy(new PreOrderTraversal());
    }

    @org.junit.Test
    public void testPreOrderTraversalWithRecursion() {
        List<Integer> actualResult = preOrderTraversalObject
                .preOrderTraversalWithRecursion(TreeUtils.createTreeFromArray(treeArray));
        assertEquals(expectedResult, actualResult);
        Mockito.verify(preOrderTraversalObject,
                        Mockito.times(expectedResult.size()))
                .preOrderTraversalWithRecursion(Mockito.any());
    }

    @org.junit.Test
    public void testPreOrderTraversalWithoutRecursion() {
        List<Integer> actualResult = preOrderTraversalObject
                .preOrderTraversalWithoutRecursion(TreeUtils.createTreeFromArray(treeArray));
        assertEquals(expectedResult, actualResult);
        Mockito.verify(preOrderTraversalObject,
                        Mockito.times(1))
                .preOrderTraversalWithoutRecursion(Mockito.any());
    }

    @After
    public void tearDown() {
        preOrderTraversalObject = null;
    }
}
