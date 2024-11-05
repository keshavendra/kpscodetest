package com.testds.leetcode.problems.minChngToMkStrBeautiful

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinChangeToMakeStringBeautiful"() {
        when:
        def actualResult = solution.minChanges(s)
        then:
        expectedResult == actualResult
        where:
        s      | expectedResult
        "1001" | 2
        "10"   | 1
        "0000" | 0
    }

}
