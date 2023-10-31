package com.testds.leetcode.problems.singleNumber3

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test singleNumber"() {
        when:
        def actualResult = solution.singleNumber(nums as int[])
        then:
        expectedResult.containsAll(actualResult)
        where:
        nums               | expectedResult
        [1, 2, 1, 3, 2, 5] | [3, 5]
        [-1, 0]            | [-1, 0]
        [0, 1]             | [0, 1]
    }
}
