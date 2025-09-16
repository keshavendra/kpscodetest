package com.testds.leetcode.problems.replaceNonCoprimes

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test ReplaceNonCoprimes"() {
        when:
        def actualResult = solution.replaceNonCoprimes(nums as int[])
        then:
        expectedResult == actualResult
        where:
        nums                                   | expectedResult
        [6, 4, 3, 2, 7, 6, 2]                  | [12, 7, 6]
        [2, 2, 1, 1, 3, 3, 3]                  | [2, 1, 1, 3]
        [517, 11, 121, 517, 3, 51, 3, 1887, 5] | [5687, 1887, 5]
    }

    def cleanup() {
        solution = null
    }

}
