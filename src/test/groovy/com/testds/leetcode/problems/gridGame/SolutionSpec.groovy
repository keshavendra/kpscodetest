package com.testds.leetcode.problems.gridGame

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GridGame"() {
        when:
        def actualResult = solution.gridGame(grid as int[][])
        then:
        expectedResult == actualResult
        where:
        grid                                                                          | expectedResult
        [[2, 5, 4], [1, 5, 1]]                                                        | 4L
        [[3, 3, 1], [8, 5, 2]]                                                        | 4L
        [[1, 3, 1, 15], [1, 3, 3, 1]]                                                 | 7L
        [[20, 3, 20, 17, 2, 12, 15, 17, 4, 15], [20, 10, 13, 14, 15, 5, 2, 3, 14, 3]] | 63L
    }

    def cleanup() {
        solution = null
    }

}
