package com.testds.leetcode.problems.isSubsequence

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test isSubsequence with different inputs"() {
        given:
        def s = inputS
        def t = inputT

        expect:
        solution.isSubsequence(s, t) == expectedResult

        where:
        inputS | inputT   | expectedResult
        ""     | "abc"    | true
        "a"    | "abc"    | true
        "d"    | "abc"    | false
        "ab"   | "ahbgdc" | true
        "axc"  | "ahbgdc" | false
        "abcd" | "abc"    | false
    }

    def "test isSubsequence with null inputs"() {
        given:
        def s = inputS
        def t = inputT

        when:
        solution.isSubsequence(s, t)

        then:
        thrown(NullPointerException)

        where:
        inputS | inputT
        null   | "abc"
        "abc"  | null
    }
}
