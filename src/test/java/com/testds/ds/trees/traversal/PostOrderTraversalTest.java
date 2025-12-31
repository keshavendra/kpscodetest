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
public class PostOrderTraversalTest extends TestCase {

    private PostOrderTraversal postOrderTraversalObject;

    @Parameterized.Parameter
    public Integer[] treeArray;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new Integer[]{1, 2, 3, 4, 5},
                        Arrays.asList(4, 5, 2, 3, 1)
                },
                {
                        new Integer[]{1, 2, 3, 4, 5, null, null, null, null, null, 6},
                        Arrays.asList(4, 6, 5, 2, 3, 1)
                }
        });
    }

    public static Test suite() {
        return new TestSuite(PostOrderTraversalTest.class);
    }

    @Before
    public void setUp() {
        postOrderTraversalObject = spy(new PostOrderTraversal());
    }

    @org.junit.Test
    public void testPostOrderTraversalWithRecursion() {
        List<Integer> actualResult = postOrderTraversalObject
                .postOrderTraversalWithRecursion(TreeUtils.createTreeFromArray(treeArray));
        assertEquals(expectedResult, actualResult);
        Mockito.verify(postOrderTraversalObject,
                        Mockito.times(2 * expectedResult.size() + 1))
                .postOrderTraversalWithRecursion(Mockito.any());
    }

    @org.junit.Test
    public void testPostOrderTraversalWithoutRecursion() {
        List<Integer> actualResult = postOrderTraversalObject
                .postOrderTraversalWithoutRecursion(TreeUtils.createTreeFromArray(treeArray));
        assertEquals(expectedResult, actualResult);
        Mockito.verify(postOrderTraversalObject,
                        Mockito.times(1))
                .postOrderTraversalWithoutRecursion(Mockito.any());
    }

    @After
    public void tearDown() {
        postOrderTraversalObject = null;
    }
}
