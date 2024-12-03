package com.testds.leetcode.problems.addSpaceToString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test AddSpaces"() {
        when:
        def actualResult = solution.addSpaces(s, spaces as int[])
        then:
        expectedResult == actualResult
        where:
        s                      | spaces                | expectedResult
        "LeetcodeHelpsMeLearn" | [8, 13, 15]           | "Leetcode Helps Me Learn"
        "icodeinpython"        | [1, 5, 7, 9]          | "i code in py thon"
        "spacing"              | [0, 1, 2, 3, 4, 5, 6] | " s p a c i n g"
    }

    def cleanup() {
        solution = null
    }

}
