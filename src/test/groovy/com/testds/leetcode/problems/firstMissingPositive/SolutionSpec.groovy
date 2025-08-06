package com.testds.leetcode.problems.firstMissingPositive

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FirstMissingPositive"() {
        when:
        def actualResult = solution.firstMissingPositive(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums              | expectedResult
        [1, 2, 0]         | 3
        [3, 4, -1, 1]     | 2
        [7, 8, 9, 11, 12] | 1
        [1]               | 2
        [1, 1]            | 2
    }

    def cleanup() {
        solution = null
    }

}
