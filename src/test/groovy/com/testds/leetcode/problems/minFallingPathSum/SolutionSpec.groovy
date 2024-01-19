package com.testds.leetcode.problems.minFallingPathSum

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinFallingPathSum"() {
        when:
        def actualResult = solution.minFallingPathSum(matrix as int[][])
        then:
        expectedResult == actualResult
        where:
        matrix                            | expectedResult
        [[2, 1, 3], [6, 5, 4], [7, 8, 9]] | 13
        [[-19, 57], [-40, -5]]            | -59
        [[-48]]                           | -48
    }

}
