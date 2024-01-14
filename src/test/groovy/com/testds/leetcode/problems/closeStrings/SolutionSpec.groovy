package com.testds.leetcode.problems.closeStrings

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CloseStrings"() {
        when:
        def actualResult = solution.closeStrings(word1, word2)
        then:
        expectedResult == actualResult
        where:
        word1     | word2     | expectedResult
        "abc"     | "bca"     | true
        "a"       | "aa"      | false
        "cabbba"  | "abbccc"  | true
        "cabbba"  | "aabbss"  | false
        "abbzzca" | "babzzcz" | false
    }

}
