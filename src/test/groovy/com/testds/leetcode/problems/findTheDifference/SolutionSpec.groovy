package com.testds.leetcode.problems.findTheDifference

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test Find the difference"() {
        when:
        def actualResult = solution.findTheDifference(s, t)
        then:
        expectedResult == actualResult
        where:
        s      | t       | expectedResult
        "abcd" | "abcde" | 'e'
        ""     | "y"     | 'y'
    }
}
