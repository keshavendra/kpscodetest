package com.testds.ds.trees.traversal;

import com.testds.ds.trees.TreeUtils;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LevelOrderTraversalTest extends TestCase {

    private LevelOrderTraversal traversal;

    @Parameterized.Parameter
    public Integer[] treeArray;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new Integer[]{1, 2, 3, 4, 5}, Arrays.asList(1, 2, 3, 4, 5)},
                        {new Integer[]{1, 2, 3, 4, 5, null, null, null, null, null, 6}, Arrays.asList(1, 2, 3, 4, 5, 6)}
                });
    }

    @Before
    public void setUp() {
        traversal = new LevelOrderTraversal();
    }

    @Test
    public void testLevelOrderTraversal() {
        List<Integer> actualResult = traversal.levelOrder(TreeUtils.createTreeFromArray(treeArray));
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        traversal = null;
    }
}
