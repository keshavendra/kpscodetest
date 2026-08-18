package com.testds.leetcode.problems.largestAlmostMissingInteger

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestInteger"() {
        when:
        def actualResult = solution.largestInteger(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums                 | k | expectedResult
        [3, 9, 2, 1, 7]      | 3 | 7
        [3, 9, 7, 2, 1, 7]   | 4 | 3
        [0, 0]               | 1 | -1
        [0, 0]               | 2 | 0
        [8, 1, 8]            | 3 | 8
        [3, 0, 12, 7, 1, 11] | 6 | 12
    }

    def cleanup() {
        solution = null
    }

}
