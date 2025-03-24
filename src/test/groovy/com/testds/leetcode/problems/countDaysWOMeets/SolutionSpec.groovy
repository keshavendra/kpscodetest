package com.testds.leetcode.problems.countDaysWOMeets

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountDays"() {
        when:
        def actualResult = solution.countDays(days, meetings as int[][])
        then:
        expectedResult == actualResult
        where:
        days | meetings                                                                    | expectedResult
        10   | [[5, 7], [1, 3], [9, 10]]                                                   | 2
        5    | [[2, 4], [1, 3]]                                                            | 1
        6    | [[1, 6]]                                                                    | 0
        57   | [[3, 49], [23, 44], [21, 56], [26, 55], [23, 52], [2, 9], [1, 48], [3, 31]] | 1
    }

    def cleanup() {
        solution = null
    }

}
