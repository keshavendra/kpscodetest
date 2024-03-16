package com.testds.leetcode.problems.findMaxLengthContiguousArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindMaxLengthContiguousArray"() {
        when:
        def actualResult = solution.findMaxLength(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                     | expectedResult
        [0, 1]                   | 2
        [0, 1, 0]                | 2
        [0, 1, 1, 0, 1, 1, 1, 0] | 4

    }

}
