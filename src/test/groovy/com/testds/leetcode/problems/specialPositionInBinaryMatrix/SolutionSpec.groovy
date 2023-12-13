package com.testds.leetcode.problems.specialPositionInBinaryMatrix

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SpecialPositionInBinaryMatrix"() {
        when:
        def actualResult = solution.numSpecial(mat as int[][])
        then:
        expectedResult == actualResult
        where:
        mat                                                                                                                                | expectedResult
        [[1, 0, 0], [0, 0, 1], [1, 0, 0]]                                                                                                  | 1
        [[1, 0, 0], [0, 1, 0], [0, 0, 1]]                                                                                                  | 3
        [[0, 0, 0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0, 0, 1], [0, 0, 0, 0, 1, 0, 0, 0], [1, 0, 0, 0, 1, 0, 0, 0], [0, 0, 1, 1, 0, 0, 0, 0]] | 1
    }

}
