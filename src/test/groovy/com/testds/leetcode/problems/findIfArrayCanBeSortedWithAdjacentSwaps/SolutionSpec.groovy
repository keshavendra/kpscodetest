package com.testds.leetcode.problems.findIfArrayCanBeSortedWithAdjacentSwaps

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindIfArrayCanBeSortedWithAdjacentSwaps"() {
        when:
        def actualResult = solution.canSortArray(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums              | expectedResult
        [8, 4, 2, 30, 15] | true
        [1, 2, 3, 4, 5]   | true
        [3, 16, 8, 4, 2]  | false
        [136, 256, 10]    | false
    }

}
