package com.testds.leetcode.problems.repeatLimitedString

import spock.lang.Specification


class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test RepeatLimitedString"() {
        when:
        def actualResult = solution.repeatLimitedString(s, repeatLimit)
        then:
        expectedResult == actualResult
        where:
        s         | repeatLimit | expectedResult
        "cczazcc" | 3           | "zzcccac"
        "aababab" | 2           | "bbabaa"
    }

    def cleanup() {
        solution = null
    }

}
