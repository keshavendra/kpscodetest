package com.testds.leetcode.problems.isGoodArray

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsGood"() {
        when:
        def actualResult = solution.isGood(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums               | expectedResult
        [2, 1, 3]          | false
        [1, 3, 3, 2]       | true
        [1, 1]             | true
        [3, 4, 4, 1, 2, 1] | false
        [1, 4, 5, 4, 3, 3] | false
    }
}
