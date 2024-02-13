package com.testds.leetcode.problems.firstPalindrome

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FirstPalindrome"() {
        when:
        def actualResult = solution.firstPalindrome(words as String[])
        then:
        expectedResult == actualResult
        where:
        words                                    | expectedResult
        ["abc", "car", "ada", "racecar", "cool"] | "ada"
        ["notapalindrome", "racecar"]            | "racecar"
        ["def", "ghi"]                           | ""
    }

}
