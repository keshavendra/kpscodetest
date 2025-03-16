package com.testds.leetcode.problems.houseRobber4

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinCapability"() {
        when:
        def actualResult = solution.minCapability(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums            | k | expectedResult
        [2, 3, 5, 9]    | 2 | 5
        [2, 7, 9, 3, 1] | 2 | 2
        [1, 2, 9, 3, 2] | 2 | 2
        [2, 2]          | 1 | 2
    }

    def cleanup() {
        solution = null
    }

}
