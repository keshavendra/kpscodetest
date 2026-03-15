package com.testds.leetcode.problems.subarraySumEqualsK

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SubarraySum"() {
        when:
        def actualResult = solution.subarraySum(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums                     | k | expectedResult
        [1, 1, 1]                | 2 | 2
        [1, 2, 3]                | 3 | 2
        [1]                      | 0 | 0
        [-1, -1, 1]              | 0 | 1
        [4, -4, 4, -1, -3, 7, 3] | 3 | 5
    }

    def cleanup() {
        solution = null
    }

}
