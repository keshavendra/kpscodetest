package com.testds.leetcode.problems.findWinners

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindWinners"() {
        when:
        def actualResult = solution.findWinners(matches as int[][])
        then:
        expectedResult == actualResult
        where:
        matches                                                                                                                                                                                                                                                                                                                                        | expectedResult
        [[1, 3], [2, 3], [3, 6], [5, 6], [5, 7], [4, 5], [4, 8], [4, 9], [10, 4], [10, 9]]                                                                                                                                                                                                                                                             | [[1, 2, 10], [4, 5, 7, 8]]
        [[2, 3], [1, 3], [5, 4], [6, 4]]                                                                                                                                                                                                                                                                                                               | [[1, 2, 5, 6], []]
        [[1, 5], [1, 10], [1, 11], [2, 11], [2, 13], [2, 14], [3, 4], [3, 8], [4, 12], [4, 15], [5, 6], [5, 10], [5, 13], [5, 19], [6, 9], [6, 10], [6, 13], [6, 14], [6, 18], [7, 10], [7, 11], [7, 12], [7, 14], [8, 10], [8, 11], [8, 14], [9, 11], [9, 12], [9, 13], [9, 16], [9, 19], [10, 17], [11, 13], [11, 17], [12, 15], [16, 17], [16, 18]] | [[1, 2, 3, 7], [4, 5, 6, 8, 9, 16]]
    }

}
