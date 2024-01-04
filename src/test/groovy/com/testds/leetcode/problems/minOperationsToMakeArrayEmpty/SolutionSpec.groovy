package com.testds.leetcode.problems.minOperationsToMakeArrayEmpty

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinOperationsToMakeArrayEmpty"() {
        when:
        def actualResult = solution.minOperations(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                                                 | expectedResult
        [2, 3, 3, 2, 2, 4, 2, 3, 4]                          | 4
        [2, 1, 2, 2, 3, 3]                                   | -1
        [19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19] | 5
        [13, 7, 13, 7, 13, 7, 13, 13, 7]                     | 4
    }
}
