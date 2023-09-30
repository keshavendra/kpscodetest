package com.testds.leetcode.problems.pattern132

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test if array contains 132 pattern"() {
        when:
        def actualResult = solution.find132pattern(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums            | expectedResult
        [1, 2, 3, 4]    | false
        [3, 1, 4, 2]    | true
        [-1, 3, 2, 0]   | true
        [3, 5, 0, 3, 4] | true
    }
}
