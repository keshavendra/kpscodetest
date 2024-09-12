package com.testds.leetcode.problems.countConsistentStrings

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CountConsistentStrings"() {
        when:
        def actualResult = solution.countConsistentStrings(allowed, words as String[])
        then:
        expectedResult == actualResult
        where:
        allowed | words                                             | expectedResult
        "ab"    | ["ad", "bd", "aaab", "baa", "badab"]              | 2
        "abc"   | ["a", "b", "c", "ab", "ac", "bc", "abc"]          | 7
        "cad"   | ["cc", "acd", "b", "ba", "bac", "bad", "ac", "d"] | 4

    }

}
