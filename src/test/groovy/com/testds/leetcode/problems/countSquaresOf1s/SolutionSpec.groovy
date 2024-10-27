package com.testds.leetcode.problems.countSquaresOf1s

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountSquaresOf1s"() {
        when:
        def actualResult = solution.countSquares(matrix as int[][])
        then:
        expectedResult == actualResult
        where:
        matrix                                     | expectedResult
        [[0, 1, 1, 1], [1, 1, 1, 1], [0, 1, 1, 1]] | 15
        [[1, 0, 1], [1, 1, 0], [1, 1, 0]]          | 7
    }

}
