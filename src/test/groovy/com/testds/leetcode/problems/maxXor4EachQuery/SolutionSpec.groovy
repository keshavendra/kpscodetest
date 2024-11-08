package com.testds.leetcode.problems.maxXor4EachQuery

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxXor4EachQuery"() {
        when:
        def actualResult = solution.getMaximumXor(nums as int[], maximumBit)
        then:
        expectedResult as int[] == actualResult
        where:
        nums               | maximumBit | expectedResult
        [0, 1, 1, 3]       | 2          | [0, 3, 2, 3]
        [2, 3, 4, 7]       | 3          | [5, 2, 6, 5]
        [0, 1, 2, 2, 5, 7] | 3          | [4, 3, 6, 4, 6, 7]
    }

}
