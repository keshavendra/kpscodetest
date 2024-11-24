package com.testds.leetcode.problems.maxMatrixSumWithPairMulByNeg1

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxMatrixSumWithPairMulByNeg1"() {
        when:
        def actualResult = solution.maxMatrixSum(matrix as int[][])
        then:
        expectedResult as long == actualResult
        where:
        matrix                               | expectedResult
        [[1, -1], [-1, 1]]                   | 4
        [[1, 2, 3], [-1, -2, -3], [1, 2, 3]] | 16
    }

    def cleanup() {
        solution = null
    }

}
