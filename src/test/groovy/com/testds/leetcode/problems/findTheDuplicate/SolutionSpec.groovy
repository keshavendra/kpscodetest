package com.testds.leetcode.problems.findTheDuplicate

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindTheDuplicate"() {
        when:
        def actualResult = solution.findDuplicate(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                           | expectedResult
        [1, 3, 4, 2, 2]                | 2
        [3, 1, 3, 4, 2]                | 3
        [2, 5, 9, 6, 9, 3, 8, 9, 7, 1] | 9
    }

}
