package com.testds.leetcode.problems.maxScoreSightseeingPair

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxScoreSightseeingPair"() {
        when:
        def actualResult = solution.maxScoreSightseeingPair(values as int[])
        then:
        expectedResult == actualResult
        where:
        values          | expectedResult
        [8, 1, 5, 2, 6] | 11
        [1, 2]          | 2
    }

}
