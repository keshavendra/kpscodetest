package com.testds.leetcode.problems.populateNextRightPointer;

import com.testds.leetcode.utils.binaryTree.Node;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 2, 3, 4, 5, 6, 7}, Arrays.asList(1, null, 2, 3, null, 4, 5, 6, 7, null)},
                {new Integer[]{}, Collections.emptyList()},
        });
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testConnect() {
        Node root = solution.connect(Node.createTree(nodes));
        assertEquals(expectedResult, performLevelOrderWithNextNode(root));
    }

    private List<Integer> performLevelOrderWithNextNode(Node node) {
        List<Integer> result = new ArrayList<>();
        if (node != null) {
            while (node != null) {
                List<Integer> list = new ArrayList<>();
                Node temp = node;
                node = node.left;
                while (temp != null) {
                    list.add(temp.val);
                    temp = temp.next;
                    if (node == null && temp != null) {
                        if (temp.left != null) {
                            node = temp.left;
                        } else {
                            node = temp.right;
                        }
                    }
                }
                list.add(null);
                result.addAll(list);
            }
        }
        return result;
    }

}
