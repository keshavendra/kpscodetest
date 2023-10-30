package com.testds.leetcode.problems.divide

import spock.lang.Specification

class SolutionSpec extends Specification {
    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test Divide "() {
        when:
        def actualResult = solution.divide(divident as int, divisor as int)
        then:
        expectedResult == actualResult
        where:
        divident    | divisor     | expectedResult
        10          | 3           | 3
        7           | -3          | -2
        -2147483648 | 2           | -1073741824
        -1010369383 | -2147483648 | 0
        -2147483648 | 122481295   | -17
    }
}
