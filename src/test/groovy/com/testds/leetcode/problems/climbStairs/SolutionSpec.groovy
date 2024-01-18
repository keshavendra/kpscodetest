package com.testds.leetcode.problems.climbStairs

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ClimbStairs"() {
        when:
        def actualResult = solution.climbStairs(n)
        then:
        expectedResult == actualResult
        where:
        n | expectedResult
        2 | 2
        3 | 3
        1 | 1
    }
}
