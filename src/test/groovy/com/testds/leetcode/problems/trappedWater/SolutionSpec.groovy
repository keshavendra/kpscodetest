package com.testds.leetcode.problems.trappedWater

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TrappedWater"() {
        when:
        def actualResult = solution.trap(height as int[])
        then:
        expectedResult == actualResult
        where:
        height                               | expectedResult
        [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] | 6
        [4, 2, 0, 3, 2, 5]                   | 9
        [1, 2, 3, 4, 5]                      | 0
        [5, 4, 3, 2, 1]                      | 0
    }

    def cleanup() {
        solution = null
    }

}
