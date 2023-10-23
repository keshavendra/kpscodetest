package com.testds.leetcode.problems.removeStars

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test removeStars"() {
        when:
        def actualResult = solution.removeStars(s)
        then:
        expectedResult == actualResult
        where:
        s             | expectedResult
        "leet**cod*e" | "lecoe"
        "erase*****"  | ""
    }
}
