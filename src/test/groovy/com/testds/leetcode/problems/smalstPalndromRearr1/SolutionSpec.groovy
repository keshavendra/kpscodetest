package com.testds.leetcode.problems.smalstPalndromRearr1

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SmallestPalindrome"() {
        when:
        def actualResult = solution.smallestPalindrome(s)
        then:
        expectedResult == actualResult
        where:
        s        | expectedResult
        "z"      | "z"
        "babab"  | "abbba"
        "daccad" | "acddca"
    }

    def cleanup() {
        solution = null
    }

}
