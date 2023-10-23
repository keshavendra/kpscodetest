package com.testds.leetcode.problems.isPowerOfFour

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsPowerOfFour "() {
        when:
        def actualResult = solution.isPowerOfFour(n)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        16 | true
        5  | false
        1  | true
        8  | false
    }
}
