package com.testds.leetcode.problems.isAnagram

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test IsAnagram"() {
        when:
        def actualResult = solution.isAnagram(s, t)
        then:
        expectedResult == actualResult
        where:
        s         | t         | expectedResult
        "anagram" | "nagaram" | true
        "rat"     | "car"     | false
    }

}
