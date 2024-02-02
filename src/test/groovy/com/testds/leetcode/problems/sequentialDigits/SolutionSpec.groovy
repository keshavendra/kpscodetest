package com.testds.leetcode.problems.sequentialDigits

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test SequentialDigits"() {
        when:
        def actualResult = solution.sequentialDigits(low, high)
        then:
        expectedResult == actualResult
        where:
        low  | high  | expectedResult
        100  | 300   | [123, 234]
        1000 | 13000 | [1234, 2345, 3456, 4567, 5678, 6789, 12345]
    }

}
