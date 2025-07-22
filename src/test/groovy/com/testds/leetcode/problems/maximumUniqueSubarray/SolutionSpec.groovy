package com.testds.leetcode.problems.maximumUniqueSubarray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumUniqueSubarray"() {
        when:
        def actualResult = solution.maximumUniqueSubarray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                        | expectedResult
        [4, 2, 4, 5, 6]             | 17
        [5, 2, 1, 2, 5, 2, 1, 2, 5] | 8
    }

}
