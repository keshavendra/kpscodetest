package com.testds.leetcode.problems.maxNumber69

import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    Solution solution

    def setup() {
        solution = new Solution()
    }

    @Unroll("Testing for num #num and expectedResult #expectedResult")
    def "Test Max69Number"() {
        when:
        def actualResult = solution.maximum69Number(num)
        then:
        expectedResult == actualResult
        where:
        num  | expectedResult
        9669 | 9969
        9996 | 9999
        9999 | 9999
    }

    def cleanup() {
        solution = null
    }

}
