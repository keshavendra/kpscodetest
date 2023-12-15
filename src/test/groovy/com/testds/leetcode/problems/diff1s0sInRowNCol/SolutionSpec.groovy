package com.testds.leetcode.problems.diff1s0sInRowNCol

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Diff1s0sInRowNCol"() {
        when:
        def actualResult = solution.onesMinusZeros(grid as int[][])
        then:
        expectedResult as int[][] == actualResult
        where:
        grid                              | expectedResult
        [[0, 1, 1], [1, 0, 1], [0, 0, 1]] | [[0, 0, 4], [0, 0, 4], [-2, -2, 2]]
        [[1, 1, 1], [1, 1, 1]]            | [[5, 5, 5], [5, 5, 5]]
    }

}
