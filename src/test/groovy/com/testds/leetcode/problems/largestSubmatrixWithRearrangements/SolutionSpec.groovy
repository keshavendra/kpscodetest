package com.testds.leetcode.problems.largestSubmatrixWithRearrangements

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test LargestSubmatrixWithRearrangements"() {
        when:
        def actualResult = solution.largestSubmatrix(matrix as int[][])
        then:
        expectedResult == actualResult
        where:
        matrix                            | expectedResult
        [[0, 0, 1], [1, 1, 1], [1, 0, 1]] | 4
        [[1, 0, 1, 0, 1]]                 | 3
        [[1, 1, 0], [1, 0, 1]]            | 2
    }

}
