package com.testds.leetcode.problems.getSumAbsoluteDifferences

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test GetSumAbsoluteDifferences"() {
        when:
        def actualResult = solution.getSumAbsoluteDifferences(nums as int[])
        then:
        expectedResult as int[] == actualResult
        where:
        nums             | expectedResult
        [2, 3, 5]        | [4, 3, 5]
        [1, 4, 6, 8, 10] | [24, 15, 13, 15, 21]
    }

}
