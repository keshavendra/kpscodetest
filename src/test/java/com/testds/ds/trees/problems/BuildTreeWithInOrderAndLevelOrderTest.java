package com.testds.ds.trees.problems;

import com.testds.ds.trees.TreeNode;
import com.testds.ds.trees.traversal.InOrderTraversal;
import com.testds.ds.trees.traversal.LevelOrderTraversal;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class BuildTreeWithInOrderAndLevelOrderTest extends TestCase {

    private BuildTreeWithInOrderAndLevelOrder buildTreeWithInOrderAndLevelOrder;

    @Parameterized.Parameter
    public int[] inOrder;

    @Parameterized.Parameter(1)
    public int[] levelOrder;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[]{4, 2, 5, 1, 6, 3, 7}, new int[]{1, 2, 3, 4, 5, 6, 7}},
                        {new int[]{4, 2, 1, 6, 3, 7}, new int[]{1, 2, 3, 4, 6, 7}}
                });
    }

    public static Test suite() {
        return new TestSuite(BuildTreeWithInOrderAndLevelOrder.class);
    }

    @Before
    public void setUp() {
        buildTreeWithInOrderAndLevelOrder = new BuildTreeWithInOrderAndLevelOrder();
    }

    @org.junit.Test
    public void testBuildTreeWithInOrderAndLevelOrder() {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        TreeNode root = buildTreeWithInOrderAndLevelOrder.buildTree(inOrder, levelOrder);
        assertNotNull(root);
        List<Integer> inOrderTraversalActual = inOrderTraversal.inOrderTraversalWithoutRecursion(root);
        List<Integer> levelOrderTraversalActual = levelOrderTraversal.levelOrder(root);
        assertEquals(inOrderTraversalActual.size(), inOrder.length);
        assertEquals(levelOrderTraversalActual.size(), levelOrder.length);
        for (int i = 0; i < inOrder.length; i++) {
            assertEquals(inOrder[i], (int) inOrderTraversalActual.get(i));
            assertEquals(levelOrder[i], (int) levelOrderTraversalActual.get(i));
        }
    }

    @After
    public void tearDown() {
        buildTreeWithInOrderAndLevelOrder = null;
    }

}
