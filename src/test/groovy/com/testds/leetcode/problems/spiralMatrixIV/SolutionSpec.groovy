package com.testds.leetcode.problems.spiralMatrixIV


import com.testds.leetcode.utils.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SpiralMatrix"() {
        when:
        def actualResult = solution.spiralMatrix(m, n, ListNode.createList(nodes as int[]))
        then:
        expectedResult as int[][] == actualResult
        where:
        m | n | nodes                                   | expectedResult
        3 | 5 | [3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0] | [[3, 0, 2, 6, 8], [5, 0, -1, -1, 1], [5, 2, 4, 9, 7]]
        1 | 4 | [0, 1, 2]                               | [[0, 1, 2, -1]]
    }

}
