package com.testds.leetcode.problems.minTimeToVisitAllPoints

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinTimeToVisitAllPoints"() {
        when:
        def actualResult = solution.minTimeToVisitAllPoints(points as int[][])
        then:
        expectedResult == actualResult
        where:
        points                    | expectedResult
        [[1, 1], [3, 4], [-1, 0]] | 7
        [[3, 2], [-2, 2]]         | 5
    }

}
