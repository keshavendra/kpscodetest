package com.testds.leetcode.problems.makeTheStringGreat

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MakeTheStringGreat"() {
        when:
        def actualResult = solution.makeGood(s)
        then:
        expectedResult == actualResult
        where:
        s            | expectedResult
        "leEeetcode" | "leetcode"
        "abBAcC"     | ""
        "s"          | "s"
    }

}
