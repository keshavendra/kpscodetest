package com.testds.leetcode.problems.balanceBST;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResults;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{2, 1, 3, null, null, null, 4}, Arrays.asList(2, 1, 3, 4)},
                {new Integer[]{2, 1, 3}, Arrays.asList(2, 1, 3)},
                {new Integer[]{4, 2, 6, 1, 3, 5, 7}, Arrays.asList(4, 2, 6, 1, 3, 5, 7)},
                {new Integer[]{3, 2, null, 1}, Arrays.asList(2, 1, 3)},
                {new Integer[]{1, null, 2, null, null, null, 3}, Arrays.asList(2, 1, 3)}
        });
    }

    public static Test suite() {
        return new TestSuite(Solution.class);
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void testBalanceBST() {
        TreeNode root = solution.balanceBST(TreeNode.createTree(nodes));
        assertEquals(expectedResults, levelOrderTraversal(root));
    }

    private static List<Integer> levelOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            root = q.poll();
            list.add(root.val);
            if (root.left != null)
                q.offer(root.left);
            if (root.right != null)
                q.offer(root.right);
        }
        return list;
    }

}
