package com.testds.leetcode.problems.maxBuilding

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxBuilding"() {
        when:
        def actualResult = solution.maxBuilding(n, restrictions as int[][])
        then:
        expectedResult == actualResult
        where:
        n  | restrictions                      | expectedResult
        5  | [[2, 1], [4, 1]]                  | 2
        6  | []                                | 5
        10 | [[5, 3], [2, 5], [7, 4], [10, 3]] | 5
    }
}
