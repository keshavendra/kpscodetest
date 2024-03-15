package com.testds.leetcode.problems.productExceptSelf

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution = new Solution()

    def setup() {
        solution = new Solution()
    }

    def "Test ProductExceptSelf"() {
        when:
        def actualResult = solution.productExceptSelf(nums as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums              | expectedResult
        [1, 2, 3, 4]      | [24, 12, 8, 6]
        [-1, 1, 0, -3, 3] | [0, 0, 9, 0, 0]
        [0, 1, 0]         | [0, 0, 0]
    }
}
