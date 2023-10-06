package com.testds.leetcode.problems.findKthLargest

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test findKthLargest"() {
        when:
        def actualResult = solution.findKthLargest(nums as int[], k)
        then:
        expectedResult == actualResult
        where:
        nums                        | k | expectedResult
        [3, 2, 1, 5, 6, 4]          | 2 | 5
        [3, 2, 3, 1, 2, 4, 5, 5, 6] | 4 | 4
    }
}
