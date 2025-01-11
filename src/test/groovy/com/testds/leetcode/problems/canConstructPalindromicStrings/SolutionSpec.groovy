package com.testds.leetcode.problems.canConstructPalindromicStrings

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test CanConstructPalindromicStrings"() {
        when:
        def actualResult = solution.canConstruct(s, k)
        then:
        expectedResult == actualResult
        where:
        s           | k | expectedResult
        "annabelle" | 2 | true
        "leetcode"  | 3 | false
        "true"      | 4 | true
    }

    def cleanup() {
        solution = null
    }

}
