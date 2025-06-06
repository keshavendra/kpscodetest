package com.testds.leetcode.problems.lexicographicallySmallestEquivalent

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SmallestEquivalentString"() {
        when:
        def actualResult = solution.smallestEquivalentString(s1, s2, baseString)
        then:
        expectedResult == actualResult
        where:
        s1         | s2         | baseString   | expectedResult
        "parker"   | "morris"   | "parser"     | "makkek"
        "hello"    | "world"    | "hold"       | "hdld"
        "leetcode" | "programs" | "sourcecode" | "aauaaaaada"
    }

    def cleanup() {
        solution = null
    }

}
