package com.testds.leetcode.problems.findHappyString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GetHappyString"() {
        when:
        def actualResult = solution.getHappyString(n, k)
        then:
        expectedResult == actualResult
        where:
        n | k | expectedResult
        1 | 3 | "c"
        1 | 4 | ""
        3 | 9 | "cab"
    }

    def cleanup() {
        solution = null
    }

}
