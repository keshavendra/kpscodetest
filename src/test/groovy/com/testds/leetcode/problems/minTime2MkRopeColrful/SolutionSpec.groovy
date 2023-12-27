package com.testds.leetcode.problems.minTime2MkRopeColrful

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinTime2MkRopeColrful"() {
        when:
        def actualResult = solution.minCost(colors, neededTime as int[])
        then:
        expectedResult == actualResult
        where:
        colors  | neededTime      | expectedResult
        "abaac" | [1, 2, 3, 4, 5] | 3
        "abc"   | [1, 2, 3]       | 0
        "aabaa" | [1, 2, 3, 4, 1] | 2
    }

}
