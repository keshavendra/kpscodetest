package com.testds.leetcode.problems.uglyNumber2

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test NthUglyNumber"() {
        when:
        def actualResult = solution.nthUglyNumber(n as int)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        2  | 2
        3  | 3
        4  | 4
        5  | 5
        6  | 6
        7  | 8
        8  | 9
        9  | 10
        10 | 12
    }

    def cleanup() {
        solution = null
    }

}
