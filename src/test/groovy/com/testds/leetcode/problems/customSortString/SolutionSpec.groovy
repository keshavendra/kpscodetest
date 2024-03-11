package com.testds.leetcode.problems.customSortString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CustomSortString"() {
        when:
        def actualResult = solution.customSortString(order, s)
        then:
        expectedResult == actualResult
        where:
        order   | s      | expectedResult
        "cba"   | "abcd" | "cbad"
        "bcafg" | "abcd" | "bcad"
    }

}
