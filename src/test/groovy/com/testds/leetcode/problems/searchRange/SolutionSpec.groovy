package com.testds.leetcode.problems.searchRange

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Search Range"() {
        when:
        def actualResult = solution.searchRange(nums as int[], target)
        then:
        expectedResult as int[] == actualResult
        where:
        nums                | target | expectedResult
        [5, 7, 7, 8, 8, 10] | 8      | [3, 4]
        [5, 7, 7, 8, 8, 10] | 6      | [-1, -1]
        []                  | 0      | [-1, -1]
        [1]                 | 1      | [0, 0]
        [2, 2]              | 3      | [-1, -1]
    }

}
