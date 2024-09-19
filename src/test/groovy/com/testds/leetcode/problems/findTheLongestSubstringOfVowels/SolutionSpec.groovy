package com.testds.leetcode.problems.findTheLongestSubstringOfVowels

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test FindTheLongestSubstring"() {
        when:
        def actualResult = solution.findTheLongestSubstring(s)
        then:
        expectedResult == actualResult
        where:
        s                   | expectedResult
        "leetcodeisgreat"   | 5
        "eleetminicoworoep" | 13
        "szy"               | 3
        "eleetminicoworoep" | 13
    }

}
