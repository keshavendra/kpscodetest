package com.testds.leetcode.problems.longestMonotonicSubarray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestMonotonicSubarray"() {
        when:
        def actualResult = solution.longestMonotonicSubarray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums            | expectedResult
        [1, 4, 3, 3, 2] | 2
        [3, 3, 3, 3]    | 1
        [3, 2, 1]       | 3
        [1, 1]          | 1
    }

    def cleanup() {
        solution = null
    }

}
