package com.testds.leetcode.problems.minimumTotalInTriangle

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MinimumTotal"() {
        when:
        def actualResult = solution.minimumTotal(triangle)
        then:
        expectedResult == actualResult
        where:
        triangle                               | expectedResult
        [[2], [3, 4], [6, 5, 7], [4, 1, 8, 3]] | 11
        [[-10]]                                | -10
    }

    def cleanup() {
        solution = null
    }

}
