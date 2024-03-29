package com.testds.leetcode.problems.dailyTemperatures

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DailyTemperatures"() {
        when:
        def actualResult = solution.dailyTemperatures(temperaturs as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        temperaturs                               | expectedResult
        [73, 74, 75, 71, 69, 72, 76, 73]          | [1, 1, 4, 2, 1, 1, 0, 0]
        [30, 40, 50, 60]                          | [1, 1, 1, 0]
        [30, 60, 90]                              | [1, 1, 0]
        [89, 62, 70, 58, 47, 47, 46, 76, 100, 70] | [8, 1, 5, 4, 3, 2, 1, 1, 0, 0]
    }

}
