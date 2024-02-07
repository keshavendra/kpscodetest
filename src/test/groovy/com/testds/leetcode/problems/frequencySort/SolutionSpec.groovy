package com.testds.leetcode.problems.frequencySort

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FrequencySort"() {
        when:
        def actualResult = solution.frequencySort(s)
        then:
        expectedResult == actualResult
        where:
        s        | expectedResult
        "tree"   | "eert"
        "cccaaa" | "aaaccc"
        "Aabb"   | "bbAa"
    }
}
