package com.testds.leetcode.problems.numOfDistinctColorBalls

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test NumOfDistinctColorBalls"() {
        when:
        def actualResult = solution.queryResults(limit, queries as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        limit | queries                                  | expectedResult
        4     | [[1, 4], [2, 5], [1, 3], [3, 4]]         | [1, 2, 2, 3]
        4     | [[0, 1], [1, 2], [2, 2], [3, 4], [4, 5]] | [1, 2, 2, 3, 4]
    }

    def cleanup() {
        solution = null
    }

}
