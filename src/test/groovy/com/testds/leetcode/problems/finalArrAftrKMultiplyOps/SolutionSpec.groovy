package com.testds.leetcode.problems.finalArrAftrKMultiplyOps

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GetFinalState"() {
        when:
        def actualResult = solution.getFinalState(nums as int[], k, multiplier)
        then:
        expectedResult as int[] == actualResult
        where:
        nums            | k | multiplier | expectedResult
        [2, 1, 3, 5, 6] | 5 | 2          | [8, 4, 6, 5, 6]
        [1, 2]          | 3 | 4          | [16, 8]
    }

    def cleanup() {
        solution = null
    }

}
