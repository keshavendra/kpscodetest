package com.testds.leetcode.problems.pascalsTriangle

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Return rows of the pascal triangle"() {
        when:
        def actualResult = solution.generate(numRows)
        then:
        expectedResult == actualResult
        where:
        numRows | expectedResult
        1       | [[1]]
        2       | [[1], [1, 1]]
        3       | [[1], [1, 1], [1, 2, 1]]
        4       | [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]
        5       | [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
        6       | [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1]]
    }
}
