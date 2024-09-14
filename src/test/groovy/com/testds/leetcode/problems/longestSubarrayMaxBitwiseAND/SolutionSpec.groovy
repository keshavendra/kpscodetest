package com.testds.leetcode.problems.longestSubarrayMaxBitwiseAND

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestSubarrayMaxBitwiseAND"() {
        when:
        def actualResult = solution.longestSubarray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [1, 2, 3, 3, 2, 2] | 2
        [1, 2, 3, 4]       | 1
        [1, 4, 2, 2, 4, 4] | 2
    }

}
