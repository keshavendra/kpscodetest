package com.testds.leetcode.problems.garbageCollection

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GarbageCollection"() {
        when:
        def actualResult = solution.garbageCollection(garbage as String[], travel as int[])
        then:
        expectedResult == actualResult
        where:
        garbage                | travel    | expectedResult
        ["G", "P", "GP", "GG"] | [2, 4, 3] | 21
        ["MMM", "PGM", "GP"]   | [3, 10]   | 37
    }

}
