package com.testds.leetcode.problems.totalWaviness

import spock.lang.Specification

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    def "Test TotalWaviness"() {
        when:
        def actualResult = solution.totalWaviness(num1 as int, num2 as int)
        then:
        expectedResult == actualResult
        where:
        num1 | num2 | expectedResult
        120  | 130  | 3
        198  | 202  | 3
        4848 | 4848 | 2
        175  | 3887 | 3807
    }


    def cleanup() {
        solution = null
    }

}
