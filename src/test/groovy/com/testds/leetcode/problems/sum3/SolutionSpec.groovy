package com.testds.leetcode.problems.sum3

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test 3Sum"() {
        when:
        def actualResult = solution.threeSum(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                  | expectedResult
        [-1, 0, 1, 2, -1, -4] | [[-1, -1, 2], [-1, 0, 1]]
        [0, 1, 1]             | []
        [0, 0, 0]             | [[0, 0, 0]]
    }

    def cleanup() {
        solution = null
    }

}
