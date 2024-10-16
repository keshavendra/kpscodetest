package com.testds.leetcode.problems.minGroupsForIntervals;

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
    public int[][] intervals;

    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {new int[][]{{0, 3}, {0, 3}}, 2},
                        {new int[][]{{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}}, 3},
                        {new int[][]{{1, 3}, {5, 6}, {8, 10}, {11, 13}}, 1},
                        {new int[][]{{229966, 812955}, {308778, 948377}, {893612, 952735}, {395781, 574123}, {478514, 875165}, {766513, 953839}, {460683, 491583}, {133951, 212694}, {376149, 838265}, {541380, 686845}, {461394, 568742}, {804546, 904032}, {422466, 467909}, {557048, 758709}, {680460, 899053}, {110928, 267321}, {470258, 650065}, {534607, 921875}, {292993, 994721}, {645020, 692560}, {898840, 947977}, {33584, 330630}, {903142, 970252}, {17375, 626775}, {804313, 972796}, {582079, 757160}, {785002, 987823}, {599263, 997719}, {486500, 527956}, {566481, 813653}, {211239, 863969}, {808577, 883125}, {21880, 516436}, {264747, 412144}, {327175, 772333}, {984807, 988224}, {758172, 916673}, {23583, 406006}, {954674, 956043}, {379202, 544291}, {688869, 785368}, {841735, 983869}, {99836, 916620}, {332504, 740696}, {740840, 793924}, {896607, 920924}, {868540, 922727}, {125849, 550941}, {433284, 685766}}, 19}
                }
        );
    }

    public static Test suite() {
        return new TestSuite(SolutionTest.class);
    }

    @org.junit.Test
    public void testMinGroupsForIntervals() {
        int actualResult = solution.minGroups(intervals);
        assertEquals(expectedResult, actualResult);
    }

}
