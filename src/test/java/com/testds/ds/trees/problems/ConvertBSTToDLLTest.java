package com.testds.ds.trees.problems;

import com.testds.leetcode.utils.TreeNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class ConvertBSTToDLLTest extends TestCase {

    private ConvertBSTToDLL convertBSTToDLL;

    @Parameterized.Parameter
    public Integer[] nodes;

    @Parameterized.Parameter(1)
    public List<Integer> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {null, new ArrayList<>()},
                        {new Integer[]{1}, Collections.singletonList(1)},
                        {new Integer[]{4, 2, 5, 1, 3}, Arrays.asList(1, 2, 3, 4, 5)},
                        {new Integer[]{4, 2, 5, 1, 3, null, 6}, Arrays.asList(1, 2, 3, 4, 5, 6)}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(ConvertBSTToDLLTest.class);
    }

    @Before
    public void setUp() {
        convertBSTToDLL = new ConvertBSTToDLL();
    }

    @org.junit.Test
    public void testConvertBST() {
        TreeNode root = TreeNode.createTree(nodes);
        TreeNode head = convertBSTToDLL.convertBST(root);

        List<Integer> actualList = collectDllValues(head);
        assertEquals(expectedResult, actualList);
    }

    private List<Integer> collectDllValues(TreeNode head) {
        List<Integer> list = new ArrayList<>();
        TreeNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.right;
        }
        return list;
    }

    @After
    public void tearDown() {
        convertBSTToDLL = null;
    }
}