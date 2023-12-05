package com.testds.leetcode.problems.numberOfMatches

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumberOfMatches"() {
        when:
        def actualResult = solution.numberOfMatches(n)
        then:
        expectedResult == actualResult
        where:
        n  | expectedResult
        7  | 6
        14 | 13
    }

}
