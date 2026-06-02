package com.testds.leetcode.problems.earliestFinishTime

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test EarliestFinishTime"() {
        when:
        def actualResult = solution.earliestFinishTime(landStartTime as int[],
                landDuration as int[],
                waterStartTime as int[],
                waterDuration as int[])
        then:
        expectedResult == actualResult
        where:
        landStartTime | landDuration | waterStartTime | waterDuration | expectedResult
        [2, 8]        | [4, 1]       | [6]            | [3]           | 9
        [5]           | [3]          | [1]            | [10]          | 14
    }

    def cleanup() {
        solution = null
    }

}
