package com.testds.leetcode.problems.maximumElementAfterDecrementingAndRearranging

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumElementAfterDecrementingAndRearranging"() {
        when:
        def actualResult = solution.maximumElementAfterDecrementingAndRearranging(arr as int[])
        then:
        expectedResult == actualResult
        where:
        arr             | expectedResult
        [1, 2, 2, 2, 1] | 2
        [100, 1, 1000]  | 3
        [1, 2, 3, 4, 5] | 5
    }
}
