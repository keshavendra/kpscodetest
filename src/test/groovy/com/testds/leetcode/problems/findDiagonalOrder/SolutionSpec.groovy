package com.testds.leetcode.problems.findDiagonalOrder

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindDiagonalOrder"() {
        when:
        def actualResult = solution.findDiagonalOrder(mat as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        mat                               | expectedResult
        [[1, 2, 3], [4, 5, 6], [7, 8, 9]] | [1, 2, 4, 7, 5, 3, 6, 8, 9]
        [[1, 2], [3, 4]]                  | [1, 2, 3, 4]
    }

    def cleanup() {
        solution = null
    }
}
