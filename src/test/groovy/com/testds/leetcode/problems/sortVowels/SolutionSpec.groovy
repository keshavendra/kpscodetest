package com.testds.leetcode.problems.sortVowels

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SortVowels"() {
        when:
        def actualResult = solution.sortVowels(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "lEetcOde" | "lEOtcede"
        "lYmpH"    | "lYmpH"

    }


}
