package com.testds.leetcode.problems.longestConsecutive

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LongestConsecutive"() {
        when:
        def actualResult = solution.longestConsecutive(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                           | expectedResult
        [100, 4, 200, 1, 3, 2]         | 4
        [0, 3, 7, 2, 5, 8, 4, 6, 0, 1] | 9
        [1, 0, 1, 2]                   | 3
    }

    def cleanup() {
        solution = null
    }

}
