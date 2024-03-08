package com.testds.leetcode.problems.countElementWithMaximumFrequency

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountElementWithMaximumFrequency"() {
        when:
        def actualResult = solution.maxFrequencyElements(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [1, 2, 2, 3, 1, 4] | 4
        [1, 2, 3, 4, 5]    | 5
    }

}
