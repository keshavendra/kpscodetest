package com.testds.leetcode.problems.backspaceCompare

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "test backspaceCompare "() {
        when:
        def actualResult = solution.backspaceCompare(s, t)
        then:
        expectedResult == actualResult
        where:
        s      | t      | expectedResult
        "ab#c" | "ad#c" | true
        "ab##" | "c#d#" | true
        "a#c"  | "b"    | false
        "a##c" | "#a#c" | true
    }
}
