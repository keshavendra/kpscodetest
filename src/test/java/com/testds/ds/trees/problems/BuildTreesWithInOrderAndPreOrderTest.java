package com.testds.ds.trees.problems;

import com.testds.ds.trees.TreeNode;
import com.testds.ds.trees.traversal.InOrderTraversal;
import com.testds.ds.trees.traversal.PreOrderTraversal;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class BuildTreesWithInOrderAndPreOrderTest extends TestCase {

    private BuildTreeWithInOrderAndPreOrder buildTreeWithInOrderAndPreOrder;
    private InOrderTraversal inOrderTraversal;
    private PreOrderTraversal preOrderTraversal;

    @Parameterized.Parameter
    public int[] preOrder;

    @Parameterized.Parameter(1)
    public int[] inOrder;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new int[]{1, 2, 4, 5, 3, 6},
                        new int[]{4, 2, 5, 1, 6, 3}
                }
        });
    }

    public static Test suite() {
        return new TestSuite(BuildTreesWithInOrderAndPreOrderTest.class);
    }

    @Before
    public void setUp() {
        buildTreeWithInOrderAndPreOrder = spy(new BuildTreeWithInOrderAndPreOrder());
        inOrderTraversal = spy(new InOrderTraversal());
        preOrderTraversal = spy(new PreOrderTraversal());
    }

    @org.junit.Test
    public void testBuildTreeWithInOrderAndPreOrder() {
        TreeNode root = buildTreeWithInOrderAndPreOrder.buildTree(preOrder, inOrder);
        assertNotNull(root);
        assert (root.getValue() == preOrder[0]);
        List<Integer> listInOrder = inOrderTraversal.inOrderTraversalWithoutRecursion(root);
        List<Integer> listPreOrder = preOrderTraversal.preOrderTraversalWithoutRecursion(root);
        for (int i = 0; i < preOrder.length; i++) {
            assert preOrder[i] == listPreOrder.get(i);
            assert inOrder[i] == listInOrder.get(i);
        }
    }

    @After
    public void tearDown() {
        buildTreeWithInOrderAndPreOrder = null;
        inOrderTraversal = null;
        preOrderTraversal = null;
    }
}
