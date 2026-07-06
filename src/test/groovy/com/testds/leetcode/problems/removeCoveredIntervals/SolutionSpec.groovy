package com.testds.leetcode.problems.removeCoveredIntervals

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RemoveCoveredIntervals"() {
        when:
        def actualResult = solution.removeCoveredIntervals(intervals as int[][])
        then:
        expectedResult == actualResult
        where:
        intervals                   | expectedResult
        [[1, 4], [3, 6], [2, 8]]    | 2
        [[1, 4], [2, 3]]            | 1
        [[3, 10], [4, 10], [5, 11]] | 2
        [[1, 2], [1, 4], [3, 4]]    | 1
    }

}
