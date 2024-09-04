package com.testds.leetcode.problems.sumOfDigitsOfString

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SumOfDigitsOfString"() {
        when:
        def actualResult = solution.getLucky(s, k)
        then:
        expectedResult == actualResult
        where:
        s                    | k | expectedResult
        "vbyytoijnbgtyrjlsc" | 2 | 15
        "iiii"               | 1 | 36
        "leetcode"           | 2 | 6
        "zbax"               | 2 | 8
    }
}
