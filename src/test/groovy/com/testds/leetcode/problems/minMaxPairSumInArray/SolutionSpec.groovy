package com.testds.leetcode.problems.minMaxPairSumInArray

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Minimum Maximum Pair Sum In Array"() {
        when:
        def actualResult = solution.minPairSum(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [3, 5, 2, 3]       | 7
        [3, 5, 4, 2, 4, 6] | 8
    }
}
