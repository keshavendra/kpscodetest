package com.testds.leetcode.problems.makeFancyString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MakeFancyString"() {
        when:
        def actualResult = solution.makeFancyString(s)
        then:
        expectedResult == actualResult
        where:
        s           | expectedResult
        "leeetcode" | "leetcode"
        "aaabaaaa"  | "aabaa"
        "aab"       | "aab"
    }

}
