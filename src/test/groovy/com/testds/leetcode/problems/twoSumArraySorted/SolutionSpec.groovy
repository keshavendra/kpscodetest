package com.testds.leetcode.problems.twoSumArraySorted

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test different inputs and respectively expected results for twosumArraySorted"() {
        when:
        def actualResult = solution.twoSum(numbers as int[], target)
        then:
        assert Arrays.equals(expectedResult as int[], actualResult)
        where:
        numbers        | target | expectedResult
        [2, 7, 11, 15] | 9      | [1, 2]
        [2, 3, 4]      | 6      | [1, 3]
        [-1, 0]        | -1     | [1, 2]
    }
}
