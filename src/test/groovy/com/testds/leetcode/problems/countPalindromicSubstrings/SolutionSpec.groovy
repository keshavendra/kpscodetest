package com.testds.leetcode.problems.countPalindromicSubstrings

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountPalindromicSubstrings"() {
        when:
        def actualResult = solution.countSubstrings(s)
        then:
        expectedResult == actualResult
        where:
        s      | expectedResult
        "abc"  | 3
        "aaa"  | 6
        "aaaa" | 10
    }

}
