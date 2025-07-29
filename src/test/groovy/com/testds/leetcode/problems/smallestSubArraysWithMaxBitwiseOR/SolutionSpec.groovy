package com.testds.leetcode.problems.smallestSubArraysWithMaxBitwiseOR

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SmallestSubArraysWithMaxBitwiseOR"() {
        when:
        def actualResult = solution.smallestSubarrays(nums as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums            | expectedResult
        [1, 0, 2, 1, 3] | [3, 3, 2, 2, 1]
        [1, 2]          | [2, 1]
        [1, 0]          | [1, 1]
    }

    def cleanup() {
        solution = null
    }

}
