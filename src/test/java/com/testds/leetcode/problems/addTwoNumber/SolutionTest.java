package com.testds.leetcode.problems.addTwoNumber;

import com.testds.leetcode.utils.ListNode;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    private final Solution solution = new Solution();

    @Parameterized.Parameter
    public int[] list1;
    @Parameterized.Parameter(1)
    public int[] list2;
    @Parameterized.Parameter(2)
    public int[] expectedList;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{2, 4, 9}, new int[]{5, 6, 4, 9}, new int[]{7, 0, 4, 0, 1}},
                {new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}},
                {new int[]{0}, new int[]{0}, new int[]{0}},
                {new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1}},
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void test() {
        assert equalNodeLists(Solution.createList(expectedList), solution.addTwoNumbers(Solution.createList(list1), Solution.createList(list2)));
    }

    private static boolean equalNodeLists(ListNode list1, ListNode list2) {
        System.out.println("Printing individual lists");
        Solution.printList(list1);
        Solution.printList(list2);
        while (list1 != null && list2 != null) {
            int val1 = list1.val;
            int val2 = list2.val;
            if (val1 != val2)
                return false;
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null && list2 == null;
    }
}
