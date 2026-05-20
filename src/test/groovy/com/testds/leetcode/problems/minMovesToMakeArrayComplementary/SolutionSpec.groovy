package com.testds.leetcode.problems.minMovesToMakeArrayComplementary

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinMoves"() {
        when:
        def actualResult = solution.minMoves(nums as int[], limit as int)
        then:
        expectedResult == actualResult
        where:
        nums                                                                                                                                                                                                    | limit | expectedResult
        [1, 2, 4, 3]                                                                                                                                                                                            | 4     | 1
        [1, 2, 2, 1]                                                                                                                                                                                            | 2     | 2
        [1, 2, 1, 2]                                                                                                                                                                                            | 2     | 0
        [1, 2, 1, 1, 2, 1]                                                                                                                                                                                      | 2     | 2
        [1, 2, 1, 1, 2, 1]                                                                                                                                                                                      | 3     | 2
        [28, 50, 76, 80, 64, 30, 32, 84, 53, 8]                                                                                                                                                                 | 84    | 4
        [2, 7, 11, 48, 29, 5, 12, 4, 27, 55, 57, 33, 45, 49, 33, 32, 26, 29, 39, 4, 13, 24, 48, 47, 3, 24, 56, 57, 28, 50, 4, 8, 34, 46, 44, 47, 44, 27, 56, 30, 16, 20, 34, 35, 57, 57, 17, 9, 25, 16, 28, 44] | 57    | 24
    }

}
//[28, 50, 76, 80, 64, 30, 32, 84, 53, 8]
//36-1, 103->1, 164->1, 94->1