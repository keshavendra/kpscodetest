package com.testds.leetcode.problems.checkValidString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CheckValidString"() {
        when:
        def actualResult = solution.checkValidString(s)
        then:
        expectedResult == actualResult
        where:
        s      | expectedResult
        "()"   | true
        "(*)"  | true
        "(*))" | true
        "*)"   | true
        "(*"   | true
    }

}
