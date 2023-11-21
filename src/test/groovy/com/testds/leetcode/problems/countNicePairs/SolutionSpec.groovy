package com.testds.leetcode.problems.countNicePairs

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountNicePairs"() {
        when:
        def actualResult = solution.countNicePairs(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                 | expectedResult
        [42, 11, 1, 97]      | 2
        [13, 10, 35, 24, 76] | 4
    }

}
