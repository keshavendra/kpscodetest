package com.testds.leetcode.problems.diagonalTraverse2

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindDiagonalOrder"() {
        when:
        def actualResult = solution.findDiagonalOrder(nums)
        then:
        expectedResult as int[] == actualResult
        where:
        nums                                                              | expectedResult
        [[1, 2, 3], [4, 5, 6], [7, 8, 9]]                                 | [1, 4, 2, 7, 5, 3, 8, 6, 9]
        [[1, 2, 3, 4, 5], [6, 7], [8], [9, 10, 11], [12, 13, 14, 15, 16]] | [1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16]
    }

}
