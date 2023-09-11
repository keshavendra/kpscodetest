package com.testds.leetcode.problems.groupThePeopleToGroupTheyBelongTo

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test the group the people"() {
        when:
        def actualResult = solution.groupThePeople(groupSizes as int[])
        then:
        expectedResult == actualResult
        where:
        groupSizes            | expectedResult
        [3, 3, 3, 3, 3, 1, 3] | [[5], [0, 1, 2], [3, 4, 6]]
        [2, 1, 3, 3, 3, 2]    | [[1], [0, 5], [2, 3, 4]]
    }
}
