package com.testds.leetcode.problems.modifyTheMatrix

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ModifyTheMatrix"() {
        when:
        def actualResult = solution.modifiedMatrix(matrix as int[][])
        then:
        expectedResult as int[][] == actualResult
        where:
        matrix                              | expectedResult
        [[1, 2, -1], [4, -1, 6], [7, 8, 9]] | [[1, 2, 9], [4, 8, 6], [7, 8, 9]]
        [[3, -1], [5, 2]]                   | [[3, 2], [5, 2]]
    }

}
