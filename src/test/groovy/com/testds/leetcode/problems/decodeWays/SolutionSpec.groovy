package com.testds.leetcode.problems.decodeWays

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test DecodeWays"() {
        when:
        def actualResult = solution.numDecodings(s)
        then:
        expectedResult == actualResult
        where:
        s    | expectedResult
        "12" | 2
        "226"     | 3
        "06"      | 0
        "1201234" | 3
    }

}
