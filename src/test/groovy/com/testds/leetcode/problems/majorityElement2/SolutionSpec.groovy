package com.testds.leetcode.problems.majorityElement2

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test majority element method"() {
        when:
        def actualResult = solution.majorityElement(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums      | expectedResult
        [3, 2, 3] | [3]
        [1]       | [1]
        [1, 2]    | [1, 2]
    }
}
