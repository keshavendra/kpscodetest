package com.testds.leetcode.problems.isomorphicStrings

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Isomorphic Strings"() {
        when:
        def actualIsIsomorphicResult = solution.isIsomorphic(s, t)
        then:
        actualIsIsomorphicResult == expectedIsIsomorphicResult
        where:
        s       | t       | expectedIsIsomorphicResult
        "egg"   | "add"   | true
        "foo"   | "bar"   | false
        "paper" | "title" | true
        "badc"  | "baba"  | false
        "13"    | "42"    | true
    }
}
