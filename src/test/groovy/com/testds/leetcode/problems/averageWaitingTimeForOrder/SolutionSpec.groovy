package com.testds.leetcode.problems.averageWaitingTimeForOrder

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test AverageWaitingTimeForOrder"() {
        when:
        def actualResult = solution.averageWaitingTime(customers as int[][])
        then:
        expectedResult as double == actualResult
        where:
        customers                          | expectedResult
        [[1, 2], [2, 5], [4, 3]]           | 5.0
        [[5, 2], [5, 4], [10, 3], [20, 1]] | 3.25000
    }

}
