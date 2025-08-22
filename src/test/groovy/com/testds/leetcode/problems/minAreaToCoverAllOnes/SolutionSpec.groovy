package com.testds.leetcode.problems.minAreaToCoverAllOnes

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Test MinimumArea with grid #grid and expectedResult #expectedResult")
    def "Test MinimumArea"() {
        when:
        def actualResult = solution.minimumArea(grid as int[][])
        then:
        expectedResult == actualResult
        where:
        grid                   | expectedResult
        [[0, 1, 0], [1, 0, 1]] | 6
        [[1, 0], [0, 0]]       | 1
    }

    def cleanup() {
        solution = null
    }

}
