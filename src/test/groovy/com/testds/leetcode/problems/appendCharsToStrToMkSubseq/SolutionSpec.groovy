package com.testds.leetcode.problems.appendCharsToStrToMkSubseq

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test AppendCharacters"() {
        when:
        def actualResult = solution.appendCharacters(s, t)
        then:
        expectedResult == actualResult
        where:
        s          | t        | expectedResult
        "coaching" | "coding" | 4
        "abcde"    | "a"      | 0
        "z"        | "abcde"  | 5
    }

}
