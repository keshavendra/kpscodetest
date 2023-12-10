package com.testds.leetcode.problems.transposeMatrix

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TransposeMatrix"() {
        when:
        def actualResult = solution.transpose(matrix as int[][])
        then:
        expectedResult as int[][] == actualResult
        where:
        matrix                            | expectedResult
        [[1, 2, 3], [4, 5, 6], [7, 8, 9]] | [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
        [[1, 2, 3], [4, 5, 6]]            | [[1, 4], [2, 5], [3, 6]]
    }

}
