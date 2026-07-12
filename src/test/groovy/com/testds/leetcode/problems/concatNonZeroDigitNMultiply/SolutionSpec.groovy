package com.testds.leetcode.problems.concatNonZeroDigitNMultiply

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SumAndMultiply"() {
        when:
        def actualResult = solution.sumAndMultiply(s, queries as int[][])
        then:
        expectedResult as int[] == actualResult
        where:
        s            | queries                  | expectedResult
        "10203004"   | [[0, 7], [1, 3], [4, 6]] | [12340, 4, 9]
        "10203004"   | [[1, 3]]                 | [4]
        "10203404"   | [[4, 6]]                 | [238]
        "1000"       | [[0, 3], [1, 1]]         | [1, 0]
        "9876543210" | [[0, 9]]                 | [444444137]
        "2711785625" | [[0, 9]]                 | [318566667]
    }

    def cleanup() {
        solution = null
    }

}
