package com.testds.leetcode.problems.maxProfitJobScheduling

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxProfitJobScheduling"() {
        when:
        def actualResult = solution.jobScheduling(startTime as int[], endTime as int[], profit as int[])
        then:
        expectedResult == actualResult
        where:
        startTime       | endTime          | profit                | expectedResult
        [1, 2, 3, 3]    | [3, 4, 5, 6]     | [50, 10, 40, 70]      | 120
        [1, 2, 3, 4, 6] | [3, 5, 10, 6, 9] | [20, 20, 100, 70, 60] | 150
        [1, 1, 1]       | [2, 3, 4]        | [5, 6, 4]             | 6
    }

}
