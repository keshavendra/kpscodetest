package com.testds.leetcode.problems.findRelativeRanks

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindRelativeRanks"() {
        when:
        def actualResult = solution.findRelativeRanks(score as int[])
        then:
        expectedResult as String[] == actualResult
        where:
        score            | expectedResult
        [5, 4, 3, 2, 1]  | ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
        [10, 3, 8, 9, 4] | ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
    }

}
