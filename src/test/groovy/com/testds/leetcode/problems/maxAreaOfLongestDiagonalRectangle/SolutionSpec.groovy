package com.testds.leetcode.problems.maxAreaOfLongestDiagonalRectangle

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxAreaOfLongestDiagonalRectangle"() {
        when:
        def actualResult = solution.areaOfMaxDiagonal(dimension as int[][])
        then:
        expectedResult == actualResult
        where:
        dimension        | expectedResult
        [[9, 3], [8, 6]] | 48
        [[3, 4], [4, 3]] | 12
    }

    def cleanup() {
        solution = null
    }

}
