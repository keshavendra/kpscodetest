package com.testds.leetcode.problems.minChangesToMakeAltBinString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test MinChangesToMakeAltBinString"() {
        when:
        def actualResult = solution.minOperations(s)
        then:
        expectedResult == actualResult
        where:
        s      | expectedResult
        "0100" | 1
        "10"   | 0
        "1111" | 2
    }

}
