package com.testds.leetcode.problems.maxSafenessFactor

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaximumSafenessFactor"() {
        when:
        def actualResult = solution.maximumSafenessFactor(grid)
        then:
        expectedResult == actualResult
        where:
        grid                                                     | expectedResult
        [[1, 0, 0], [0, 0, 0], [0, 0, 1]]                        | 0
        [[0, 0, 1], [0, 0, 0], [0, 0, 0]]                        | 2
        [[0, 0, 0, 1], [0, 0, 0, 0], [0, 0, 0, 0], [1, 0, 0, 0]] | 2
    }
}
