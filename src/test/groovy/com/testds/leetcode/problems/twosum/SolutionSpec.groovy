package com.testds.leetcode.problems.twosum

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test different inputs and respectively expected results"() {
        when:

        def actualResult = solution.twoSum(nums as int[], target)
        then:
        assert expectedResult.containsAll(actualResult)
//        assert actualResult.containsAll(expectedResult)
        where:
        nums           | target | expectedResult
        [1, 5, 2, 6]   | 11     | [1, 3]
        [2, 7, 11, 15] | 9      | [0, 1]
        [3, 2, 4]      | 6      | [1, 2]
        [3, 3]         | 6      | [0, 1]
    }
}
