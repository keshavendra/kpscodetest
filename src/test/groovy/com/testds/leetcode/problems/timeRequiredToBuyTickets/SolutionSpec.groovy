package com.testds.leetcode.problems.timeRequiredToBuyTickets

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TimeRequiredToBuyTickets"() {
        when:
        def actualResult = solution.timeRequiredToBuy(tickets as int[], k)
        then:
        expectedResult == actualResult
        where:
        tickets      | k | expectedResult
        [2, 3, 2]    | 2 | 6
        [5, 1, 1, 1] | 0 | 8
    }

}
