package com.testds.leetcode.problems.minStrLenAfterRemvSubStr

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Minimum String Length After Removing Substrings"() {
        when:
        def actualResult = solution.minLength(s)
        then:
        expectedResult == actualResult
        where:
        s          | expectedResult
        "ABFCACDB" | 2
        "ACBBD"    | 5
    }

}
