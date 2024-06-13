package com.testds.leetcode.problems.minNumMoves2SeatAll

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinMovesToSeat"() {
        when:
        def actualResult = solution.minMovesToSeat(seats as int[], students as int[])
        then:
        expectedResult == actualResult
        where:
        seats                                 | students                             | expectedResult
        [3, 1, 5]                             | [2, 7, 4]                            | 4
        [4, 1, 5, 9]                          | [1, 3, 2, 6]                         | 7
        [2, 2, 6, 6]                          | [1, 3, 2, 6]                         | 4
        [3, 20, 17, 2, 12, 15, 17, 4, 15, 20] | [10, 13, 14, 15, 5, 2, 3, 14, 3, 18] | 28
    }

}
