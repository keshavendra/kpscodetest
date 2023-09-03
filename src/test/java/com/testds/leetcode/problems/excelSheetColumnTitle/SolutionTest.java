package com.testds.leetcode.problems.excelSheetColumnTitle;

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
    public int columnNumber;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "A"},
                {28, "AB"},
                {701, "ZY"},
                {52, "AZ"},
                {78, "BZ"},
                {703, "AAA"}
        });
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testExcelSheetColumnTitle() {
        assert expectedResult.equals(solution.convertToTitle(columnNumber));
    }

}
