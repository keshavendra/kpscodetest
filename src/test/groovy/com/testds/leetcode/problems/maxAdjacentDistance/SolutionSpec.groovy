package com.testds.leetcode.problems.maxAdjacentDistance

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxAdjacentDistance"() {
        when:
        def actualResult = solution.maxAdjacentDistance(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums          | expectedResult
        [1, 2, 4]     | 3
        [-5, -10, -5] | 5
    }

    def cleanup() {
        solution = null
    }

}
