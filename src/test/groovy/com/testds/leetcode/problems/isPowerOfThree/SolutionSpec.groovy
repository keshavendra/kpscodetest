package com.testds.leetcode.problems.isPowerOfThree

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsPowerOfThree"() {
        when:
        def actualResult = solution.isPowerOfThree(n)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        0  | false
        1  | true
        2  | false
        3  | true
        8  | false
        -1 | false
        9  | true
    }
}
