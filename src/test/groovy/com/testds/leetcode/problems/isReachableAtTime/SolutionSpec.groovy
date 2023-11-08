package com.testds.leetcode.problems.isReachableAtTime

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsReachableAtTime"() {
        when:
        def actualResult = solution.isReachableAtTime(sx, sy, fx, fy, t)
        then:
        expectedResult == actualResult
        where:
        sx | sy | fx | fy | t | expectedResult
        2  | 4  | 7  | 7  | 6 | true
        3  | 1  | 7  | 3  | 3 | false
        1  | 1  | 1  | 1  | 3 | true
    }
}
