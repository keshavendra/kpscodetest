package com.testds.leetcode.problems.singleNumber2

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SingleNumber2"() {
        when:
        def actualResult = solution.singleNumber(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                   | expectedResult
        [2, 2, 3, 2]           | 3
        [0, 1, 0, 1, 0, 1, 99] | 99
    }
}
