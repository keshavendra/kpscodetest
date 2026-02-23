package com.testds.leetcode.problems.minCostToConnectAllPoints

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll
    def "Test MinCostConnectPoints"() {
        when:
        def actualResult = solution.minCostConnectPoints(points as int[][])
        then:
        expectedResult == actualResult
        where:
        points                                                      | expectedResult
        [[0, 0], [2, 2], [3, 10], [5, 2], [7, 0]]                   | 20
        [[7, 18], [-15, 19], [-18, -15], [-7, 14], [4, 1], [-6, 3]] | 85
    }

}
