package com.testds.leetcode.problems.areAlmostEqual

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test AreAlmostEqual"() {
        when:
        def actualResult = solution.areAlmostEqual(s1, s2)
        then:
        expectedResult == actualResult
        where:
        s1       | s2       | expectedResult
        "bank"   | "kanb"   | true
        "attack" | "defend" | false
        "kelb"   | "kelb"   | true
        "bankb"  | "kannb"  | false
    }

}
