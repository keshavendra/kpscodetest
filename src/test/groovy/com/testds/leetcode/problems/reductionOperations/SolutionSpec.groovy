package com.testds.leetcode.problems.reductionOperations

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReductionOperations"() {
        when:
        def actualResult = solution.reductionOperations(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums            | expectedResult
        [5, 1, 3]       | 3
        [1, 1, 1]       | 0
        [1, 1, 2, 2, 3] | 4
    }

}
