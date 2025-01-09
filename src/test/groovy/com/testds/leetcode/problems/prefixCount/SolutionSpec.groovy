package com.testds.leetcode.problems.prefixCount

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test PrefixCount"() {
        when:
        def actualResult = solution.prefixCount(words as String[], pref)
        then:
        expectedResult == actualResult
        where:
        words                                      | pref   | expectedResult
        ["pay", "attention", "practice", "attend"] | "at"   | 2
        ["leetcode", "win", "loops", "success"]    | "code" | 0
    }

}
