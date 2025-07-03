package com.testds.leetcode.problems.possibleStringCount1

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test PossibleStringCount"() {
        when:
        def actualResult = solution.possibleStringCount(word)
        then:
        expectedResult == actualResult
        where:
        word      | expectedResult
        "abbcccc" | 5
        "abcd"    | 1
        "aaaa"    | 4
    }

}
