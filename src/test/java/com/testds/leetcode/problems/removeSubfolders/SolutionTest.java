package com.testds.leetcode.problems.removeSubfolders;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    private Solution solution;

    @Parameterized.Parameter
    public String[] folders;

    @Parameterized.Parameter(1)
    public List<String> expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {
                                new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"},
                                Arrays.asList("/a", "/c/d", "/c/f")
                        },
                        {
                                new String[]{"/a", "/a/b/c", "/a/b/d"},
                                Collections.singletonList("/a")
                        }
                }
        );
    }

    @Before
    public void setUp() {
        solution = new Solution();
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testRemoveSubfolders() {
        assertEquals(expectedResult, solution.removeSubfolders(folders));
    }

    @After
    public void tearDown() {
        solution = null;
    }
}
