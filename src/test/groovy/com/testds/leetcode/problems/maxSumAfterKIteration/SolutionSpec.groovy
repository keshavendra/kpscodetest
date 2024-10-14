package com.testds.leetcode.problems.maxSumAfterKIteration

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MaxSumAfterKIteration"() {
        when:
        def actualResult = solution.maxKelements(nums as int[], k)
        then:
        expectedResult as long == actualResult
        where:
        nums             | k | expectedResult
        [1, 10, 3, 3, 3] | 3 | 17
    }

}
